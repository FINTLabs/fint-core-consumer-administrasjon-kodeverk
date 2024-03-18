package no.fintlabs.consumer.model.fravarsgrunn;

import no.fint.model.resource.administrasjon.kodeverk.FravarsgrunnResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class FravarsgrunnEntityKafkaConsumer extends EntityKafkaConsumer<FravarsgrunnResource> {

    public FravarsgrunnEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            FravarsgrunnConfig fravarsgrunnConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, fravarsgrunnConfig);
    }
}
