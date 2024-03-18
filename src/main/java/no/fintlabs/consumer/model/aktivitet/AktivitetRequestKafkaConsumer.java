package no.fintlabs.consumer.model.aktivitet;

import no.fint.model.resource.administrasjon.kodeverk.AktivitetResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class AktivitetRequestKafkaConsumer extends EventRequestKafkaConsumer<AktivitetResource> {
    public AktivitetRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, AktivitetConfig aktivitetConfig) {
        super(eventConsumerFactoryService, aktivitetConfig);
    }
}
