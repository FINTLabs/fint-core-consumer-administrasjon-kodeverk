package no.fintlabs.consumer.model.arbeidsforholdstype;

import no.fint.model.resource.administrasjon.kodeverk.ArbeidsforholdstypeResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class ArbeidsforholdstypeEntityKafkaConsumer extends EntityKafkaConsumer<ArbeidsforholdstypeResource> {

    public ArbeidsforholdstypeEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            ArbeidsforholdstypeConfig arbeidsforholdstypeConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, arbeidsforholdstypeConfig);
    }
}
