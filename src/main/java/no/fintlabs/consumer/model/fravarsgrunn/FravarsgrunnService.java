package no.fintlabs.consumer.model.fravarsgrunn;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.resource.administrasjon.kodeverk.FravarsgrunnResource;
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
public class FravarsgrunnService extends CacheService<FravarsgrunnResource> {

    private final EntityKafkaConsumer<FravarsgrunnResource> entityKafkaConsumer;

    private final FravarsgrunnLinker linker;

    private final FravarsgrunnResponseKafkaConsumer fravarsgrunnResponseKafkaConsumer;

    public FravarsgrunnService(
            FravarsgrunnConfig consumerConfig,
            CacheManager cacheManager,
            FravarsgrunnEntityKafkaConsumer entityKafkaConsumer,
            FravarsgrunnLinker linker, FravarsgrunnResponseKafkaConsumer fravarsgrunnResponseKafkaConsumer) {
        super(consumerConfig, cacheManager, entityKafkaConsumer);
        this.entityKafkaConsumer = entityKafkaConsumer;
        this.linker = linker;
        this.fravarsgrunnResponseKafkaConsumer = fravarsgrunnResponseKafkaConsumer;
    }

    @Override
    protected Cache<FravarsgrunnResource> initializeCache(CacheManager cacheManager, ConsumerConfig<FravarsgrunnResource> consumerConfig, String s) {
        return cacheManager.create(PackingTypes.POJO, consumerConfig.getOrgId(), consumerConfig.getResourceName());
    }

    @PostConstruct
    private void registerKafkaListener() {
        long retention = entityKafkaConsumer.registerListener(FravarsgrunnResource.class, this::addResourceToCache);
        getCache().setRetentionPeriodInMs(retention);
    }

    private void addResourceToCache(ConsumerRecord<String, FravarsgrunnResource> consumerRecord) {
        this.eventLogger.logDataRecieved();
        FravarsgrunnResource resource = consumerRecord.value();
        if (resource == null) {
            getCache().remove(consumerRecord.key());
        } else {
            linker.mapLinks(resource);
            this.getCache().put(consumerRecord.key(), resource, linker.hashCodes(resource));
            if (consumerRecord.headers().lastHeader("event-corr-id") != null){
                String corrId = new String(consumerRecord.headers().lastHeader("event-corr-id").value(), StandardCharsets.UTF_8);
                log.debug("Adding corrId to EntityResponseCache: {}", corrId);
                fravarsgrunnResponseKafkaConsumer.getEntityCache().add(corrId, resource);
            }
        }
    }

    @Override
    public Optional<FravarsgrunnResource> getBySystemId(String systemId) {
        return getCache().getLastUpdatedByFilter(systemId.hashCode(),
                (resource) -> Optional
                        .ofNullable(resource)
                        .map(FravarsgrunnResource::getSystemId)
                        .map(Identifikator::getIdentifikatorverdi)
                        .map(systemId::equals)
                        .orElse(false)
        );
    }
}
