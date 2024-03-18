package no.fintlabs.consumer.model.fravarstype;

import no.fint.model.resource.administrasjon.kodeverk.FravarstypeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FravarstypeRequestKafkaConsumer extends EventRequestKafkaConsumer<FravarstypeResource> {
    public FravarstypeRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FravarstypeConfig fravarstypeConfig) {
        super(eventConsumerFactoryService, fravarstypeConfig);
    }
}
