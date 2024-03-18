package no.fintlabs.consumer.model.aktivitet;

import no.fint.model.resource.administrasjon.kodeverk.AktivitetResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class AktivitetResponseKafkaConsumer extends EventResponseKafkaConsumer<AktivitetResource> {

    public AktivitetResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, AktivitetConfig aktivitetConfig, AktivitetLinker aktivitetLinker) {
        super(eventConsumerFactoryService, aktivitetConfig, aktivitetLinker);
    }

}
