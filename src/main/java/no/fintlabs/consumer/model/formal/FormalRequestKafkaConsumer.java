package no.fintlabs.consumer.model.formal;

import no.fint.model.resource.administrasjon.kodeverk.FormalResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FormalRequestKafkaConsumer extends EventRequestKafkaConsumer<FormalResource> {
    public FormalRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FormalConfig formalConfig) {
        super(eventConsumerFactoryService, formalConfig);
    }
}
