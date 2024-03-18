package no.fintlabs.consumer.model.kontrakt;

import no.fint.model.resource.administrasjon.kodeverk.KontraktResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class KontraktResponseKafkaConsumer extends EventResponseKafkaConsumer<KontraktResource> {

    public KontraktResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, KontraktConfig kontraktConfig, KontraktLinker kontraktLinker) {
        super(eventConsumerFactoryService, kontraktConfig, kontraktLinker);
    }

}
