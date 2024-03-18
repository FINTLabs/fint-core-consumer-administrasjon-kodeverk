package no.fintlabs.consumer.model.ansvar;

import no.fint.model.resource.administrasjon.kodeverk.AnsvarResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class AnsvarEntityKafkaConsumer extends EntityKafkaConsumer<AnsvarResource> {

    public AnsvarEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            AnsvarConfig ansvarConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, ansvarConfig);
    }
}
