package no.fintlabs.consumer.model.uketimetall;

import no.fint.model.resource.administrasjon.kodeverk.UketimetallResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class UketimetallEntityKafkaConsumer extends EntityKafkaConsumer<UketimetallResource> {

    public UketimetallEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            UketimetallConfig uketimetallConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, uketimetallConfig);
    }
}
