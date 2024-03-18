package no.fintlabs.consumer.model.arbeidsforholdstype;

import no.fint.model.resource.administrasjon.kodeverk.ArbeidsforholdstypeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ArbeidsforholdstypeRequestKafkaConsumer extends EventRequestKafkaConsumer<ArbeidsforholdstypeResource> {
    public ArbeidsforholdstypeRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ArbeidsforholdstypeConfig arbeidsforholdstypeConfig) {
        super(eventConsumerFactoryService, arbeidsforholdstypeConfig);
    }
}
