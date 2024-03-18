package no.fintlabs.consumer.model.lopenummer;

import no.fint.model.resource.administrasjon.kodeverk.LopenummerResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class LopenummerEntityKafkaConsumer extends EntityKafkaConsumer<LopenummerResource> {

    public LopenummerEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            LopenummerConfig lopenummerConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, lopenummerConfig);
    }
}
