package no.fintlabs.consumer.model.lonnsart;

import no.fint.model.resource.administrasjon.kodeverk.LonnsartResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class LonnsartEntityKafkaConsumer extends EntityKafkaConsumer<LonnsartResource> {

    public LonnsartEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            LonnsartConfig lonnsartConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, lonnsartConfig);
    }
}
