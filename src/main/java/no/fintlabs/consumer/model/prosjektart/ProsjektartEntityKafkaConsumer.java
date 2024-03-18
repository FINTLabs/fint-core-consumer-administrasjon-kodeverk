package no.fintlabs.consumer.model.prosjektart;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektartResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektartEntityKafkaConsumer extends EntityKafkaConsumer<ProsjektartResource> {

    public ProsjektartEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            ProsjektartConfig prosjektartConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, prosjektartConfig);
    }
}
