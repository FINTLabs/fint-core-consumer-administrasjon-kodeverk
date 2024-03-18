package no.fintlabs.consumer.model.personalressurskategori;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.resource.administrasjon.kodeverk.PersonalressurskategoriResource;
import no.fintlabs.cache.Cache;
import no.fintlabs.cache.CacheManager;
import no.fintlabs.cache.packing.PackingTypes;
import no.fintlabs.core.consumer.shared.resource.CacheService;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Slf4j
@Service
public class PersonalressurskategoriService extends CacheService<PersonalressurskategoriResource> {

    private final EntityKafkaConsumer<PersonalressurskategoriResource> entityKafkaConsumer;

    private final PersonalressurskategoriLinker linker;

    private final PersonalressurskategoriResponseKafkaConsumer personalressurskategoriResponseKafkaConsumer;

    public PersonalressurskategoriService(
            PersonalressurskategoriConfig consumerConfig,
            CacheManager cacheManager,
            PersonalressurskategoriEntityKafkaConsumer entityKafkaConsumer,
            PersonalressurskategoriLinker linker, PersonalressurskategoriResponseKafkaConsumer personalressurskategoriResponseKafkaConsumer) {
        super(consumerConfig, cacheManager, entityKafkaConsumer);
        this.entityKafkaConsumer = entityKafkaConsumer;
        this.linker = linker;
        this.personalressurskategoriResponseKafkaConsumer = personalressurskategoriResponseKafkaConsumer;
    }

    @Override
    protected Cache<PersonalressurskategoriResource> initializeCache(CacheManager cacheManager, ConsumerConfig<PersonalressurskategoriResource> consumerConfig, String s) {
        return cacheManager.create(PackingTypes.POJO, consumerConfig.getOrgId(), consumerConfig.getResourceName());
    }

    @PostConstruct
    private void registerKafkaListener() {
        long retention = entityKafkaConsumer.registerListener(PersonalressurskategoriResource.class, this::addResourceToCache);
        getCache().setRetentionPeriodInMs(retention);
    }

    private void addResourceToCache(ConsumerRecord<String, PersonalressurskategoriResource> consumerRecord) {
        this.eventLogger.logDataRecieved();
        PersonalressurskategoriResource resource = consumerRecord.value();
        if (resource == null) {
            getCache().remove(consumerRecord.key());
        } else {
            linker.mapLinks(resource);
            this.getCache().put(consumerRecord.key(), resource, linker.hashCodes(resource));
            if (consumerRecord.headers().lastHeader("event-corr-id") != null){
                String corrId = new String(consumerRecord.headers().lastHeader("event-corr-id").value(), StandardCharsets.UTF_8);
                log.debug("Adding corrId to EntityResponseCache: {}", corrId);
                personalressurskategoriResponseKafkaConsumer.getEntityCache().add(corrId, resource);
            }
        }
    }

    @Override
    public Optional<PersonalressurskategoriResource> getBySystemId(String systemId) {
        return getCache().getLastUpdatedByFilter(systemId.hashCode(),
                (resource) -> Optional
                        .ofNullable(resource)
                        .map(PersonalressurskategoriResource::getSystemId)
                        .map(Identifikator::getIdentifikatorverdi)
                        .map(systemId::equals)
                        .orElse(false)
        );
    }
}
