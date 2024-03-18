package no.fintlabs.consumer.model.formal;

import no.fint.model.resource.administrasjon.kodeverk.FormalResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FormalResponseKafkaConsumer extends EventResponseKafkaConsumer<FormalResource> {

    public FormalResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FormalConfig formalConfig, FormalLinker formalLinker) {
        super(eventConsumerFactoryService, formalConfig, formalLinker);
    }

}
