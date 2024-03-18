package no.fintlabs.consumer.model.ramme;

import no.fint.model.resource.administrasjon.kodeverk.RammeResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class RammeEntityKafkaConsumer extends EntityKafkaConsumer<RammeResource> {

    public RammeEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            RammeConfig rammeConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, rammeConfig);
    }
}
