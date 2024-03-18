package no.fintlabs.consumer.model.funksjon;

import no.fint.model.resource.administrasjon.kodeverk.FunksjonResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FunksjonRequestKafkaConsumer extends EventRequestKafkaConsumer<FunksjonResource> {
    public FunksjonRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FunksjonConfig funksjonConfig) {
        super(eventConsumerFactoryService, funksjonConfig);
    }
}
