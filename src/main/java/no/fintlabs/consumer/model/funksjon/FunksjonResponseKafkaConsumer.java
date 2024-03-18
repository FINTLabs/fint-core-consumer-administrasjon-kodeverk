package no.fintlabs.consumer.model.funksjon;

import no.fint.model.resource.administrasjon.kodeverk.FunksjonResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FunksjonResponseKafkaConsumer extends EventResponseKafkaConsumer<FunksjonResource> {

    public FunksjonResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FunksjonConfig funksjonConfig, FunksjonLinker funksjonLinker) {
        super(eventConsumerFactoryService, funksjonConfig, funksjonLinker);
    }

}
