package no.fintlabs.consumer.model.fravarstype;

import no.fint.model.resource.administrasjon.kodeverk.FravarstypeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FravarstypeResponseKafkaConsumer extends EventResponseKafkaConsumer<FravarstypeResource> {

    public FravarstypeResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FravarstypeConfig fravarstypeConfig, FravarstypeLinker fravarstypeLinker) {
        super(eventConsumerFactoryService, fravarstypeConfig, fravarstypeLinker);
    }

}
