package no.fintlabs.consumer.model.prosjekt;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektEntityKafkaConsumer extends EntityKafkaConsumer<ProsjektResource> {

    public ProsjektEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            ProsjektConfig prosjektConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, prosjektConfig);
    }
}
