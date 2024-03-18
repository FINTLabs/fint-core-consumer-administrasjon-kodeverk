package no.fintlabs.consumer.model.art;

import no.fint.model.resource.administrasjon.kodeverk.ArtResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class ArtEntityKafkaConsumer extends EntityKafkaConsumer<ArtResource> {

    public ArtEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            ArtConfig artConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, artConfig);
    }
}
