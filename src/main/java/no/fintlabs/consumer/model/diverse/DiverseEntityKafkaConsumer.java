package no.fintlabs.consumer.model.diverse;

import no.fint.model.resource.administrasjon.kodeverk.DiverseResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class DiverseEntityKafkaConsumer extends EntityKafkaConsumer<DiverseResource> {

    public DiverseEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            DiverseConfig diverseConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, diverseConfig);
    }
}
