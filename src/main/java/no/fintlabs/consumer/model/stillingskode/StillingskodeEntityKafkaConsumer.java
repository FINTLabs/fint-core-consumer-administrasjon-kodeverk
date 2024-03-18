package no.fintlabs.consumer.model.stillingskode;

import no.fint.model.resource.administrasjon.kodeverk.StillingskodeResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class StillingskodeEntityKafkaConsumer extends EntityKafkaConsumer<StillingskodeResource> {

    public StillingskodeEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            StillingskodeConfig stillingskodeConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, stillingskodeConfig);
    }
}
