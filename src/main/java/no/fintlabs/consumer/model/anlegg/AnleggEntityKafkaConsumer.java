package no.fintlabs.consumer.model.anlegg;

import no.fint.model.resource.administrasjon.kodeverk.AnleggResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class AnleggEntityKafkaConsumer extends EntityKafkaConsumer<AnleggResource> {

    public AnleggEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            AnleggConfig anleggConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, anleggConfig);
    }
}
