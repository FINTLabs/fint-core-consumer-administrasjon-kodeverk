package no.fintlabs.consumer.model.objekt;

import no.fint.model.resource.administrasjon.kodeverk.ObjektResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class ObjektEntityKafkaConsumer extends EntityKafkaConsumer<ObjektResource> {

    public ObjektEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            ObjektConfig objektConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, objektConfig);
    }
}
