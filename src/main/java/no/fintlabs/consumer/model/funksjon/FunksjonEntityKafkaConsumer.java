package no.fintlabs.consumer.model.funksjon;

import no.fint.model.resource.administrasjon.kodeverk.FunksjonResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class FunksjonEntityKafkaConsumer extends EntityKafkaConsumer<FunksjonResource> {

    public FunksjonEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            FunksjonConfig funksjonConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, funksjonConfig);
    }
}
