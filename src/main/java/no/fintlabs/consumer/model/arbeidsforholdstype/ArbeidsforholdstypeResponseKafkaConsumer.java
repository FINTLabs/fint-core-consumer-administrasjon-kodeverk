package no.fintlabs.consumer.model.arbeidsforholdstype;

import no.fint.model.resource.administrasjon.kodeverk.ArbeidsforholdstypeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ArbeidsforholdstypeResponseKafkaConsumer extends EventResponseKafkaConsumer<ArbeidsforholdstypeResource> {

    public ArbeidsforholdstypeResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ArbeidsforholdstypeConfig arbeidsforholdstypeConfig, ArbeidsforholdstypeLinker arbeidsforholdstypeLinker) {
        super(eventConsumerFactoryService, arbeidsforholdstypeConfig, arbeidsforholdstypeLinker);
    }

}
