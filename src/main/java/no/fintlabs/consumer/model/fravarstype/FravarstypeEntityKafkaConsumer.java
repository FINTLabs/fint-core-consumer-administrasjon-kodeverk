package no.fintlabs.consumer.model.fravarstype;

import no.fint.model.resource.administrasjon.kodeverk.FravarstypeResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class FravarstypeEntityKafkaConsumer extends EntityKafkaConsumer<FravarstypeResource> {

    public FravarstypeEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            FravarstypeConfig fravarstypeConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, fravarstypeConfig);
    }
}
