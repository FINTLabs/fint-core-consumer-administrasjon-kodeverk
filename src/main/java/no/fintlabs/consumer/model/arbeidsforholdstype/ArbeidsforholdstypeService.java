package no.fintlabs.consumer.model.arbeidsforholdstype;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.resource.administrasjon.kodeverk.ArbeidsforholdstypeResource;
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
public class ArbeidsforholdstypeService extends CacheService<ArbeidsforholdstypeResource> {

    private final EntityKafkaConsumer<ArbeidsforholdstypeResource> entityKafkaConsumer;

    private final ArbeidsforholdstypeLinker linker;


    public ArbeidsforholdstypeService(
            ArbeidsforholdstypeConfig consumerConfig,
            CacheManager cacheManager,
            ArbeidsforholdstypeEntityKafkaConsumer entityKafkaConsumer,
            ArbeidsforholdstypeLinker linker) {
        super(consumerConfig, cacheManager, entityKafkaConsumer);
        this.entityKafkaConsumer = entityKafkaConsumer;
        this.linker = linker;
    }

    @Override
    protected Cache<ArbeidsforholdstypeResource> initializeCache(CacheManager cacheManager, ConsumerConfig<ArbeidsforholdstypeResource> consumerConfig, String s) {
        return cacheManager.create(PackingTypes.POJO, consumerConfig.getOrgId(), consumerConfig.getResourceName());
    }

    @PostConstruct
    private void registerKafkaListener() {
        entityKafkaConsumer.registerListener(ArbeidsforholdstypeResource.class, this::addResourceToCache);
    }

    private void addResourceToCache(ConsumerRecord<String, ArbeidsforholdstypeResource> consumerRecord) {
        updateRetensionTime(consumerRecord.headers().lastHeader("topic-retension-time"));
        this.eventLogger.logDataRecieved();
        if (consumerRecord.value() == null) {
            getCache().remove(consumerRecord.key());
        } else {
            ArbeidsforholdstypeResource resource = consumerRecord.value();
            linker.mapLinks(resource);
            getCache().put(consumerRecord.key(), resource, linker.hashCodes(resource));
        }
    }

    @Override
    public Optional<ArbeidsforholdstypeResource> getBySystemId(String systemId) {
        return getCache().getLastUpdatedByFilter(systemId.hashCode(),
                (resource) -> Optional
                        .ofNullable(resource)
                        .map(ArbeidsforholdstypeResource::getSystemId)
                        .map(Identifikator::getIdentifikatorverdi)
                        .map(systemId::equals)
                        .orElse(false)
        );
    }
}
