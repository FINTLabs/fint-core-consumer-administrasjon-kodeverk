package no.fintlabs.consumer.model.formal;

import no.fint.model.resource.administrasjon.kodeverk.FormalResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class FormalEntityKafkaConsumer extends EntityKafkaConsumer<FormalResource> {

    public FormalEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            FormalConfig formalConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, formalConfig);
    }
}
