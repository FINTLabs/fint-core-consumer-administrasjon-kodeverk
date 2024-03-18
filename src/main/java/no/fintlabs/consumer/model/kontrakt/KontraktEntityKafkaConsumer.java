package no.fintlabs.consumer.model.kontrakt;

import no.fint.model.resource.administrasjon.kodeverk.KontraktResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class KontraktEntityKafkaConsumer extends EntityKafkaConsumer<KontraktResource> {

    public KontraktEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            KontraktConfig kontraktConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, kontraktConfig);
    }
}
