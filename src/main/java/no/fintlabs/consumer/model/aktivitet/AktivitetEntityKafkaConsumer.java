package no.fintlabs.consumer.model.aktivitet;

import no.fint.model.resource.administrasjon.kodeverk.AktivitetResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class AktivitetEntityKafkaConsumer extends EntityKafkaConsumer<AktivitetResource> {

    public AktivitetEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            AktivitetConfig aktivitetConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, aktivitetConfig);
    }
}
