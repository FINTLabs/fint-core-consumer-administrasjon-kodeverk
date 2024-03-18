package no.fintlabs.consumer.model.diverse;

import no.fint.model.resource.administrasjon.kodeverk.DiverseResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class DiverseResponseKafkaConsumer extends EventResponseKafkaConsumer<DiverseResource> {

    public DiverseResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, DiverseConfig diverseConfig, DiverseLinker diverseLinker) {
        super(eventConsumerFactoryService, diverseConfig, diverseLinker);
    }

}
