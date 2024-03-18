package no.fintlabs.consumer.model.kontrakt;

import no.fint.model.resource.administrasjon.kodeverk.KontraktResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class KontraktRequestKafkaConsumer extends EventRequestKafkaConsumer<KontraktResource> {
    public KontraktRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, KontraktConfig kontraktConfig) {
        super(eventConsumerFactoryService, kontraktConfig);
    }
}
