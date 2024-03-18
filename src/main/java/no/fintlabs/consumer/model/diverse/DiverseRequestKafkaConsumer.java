package no.fintlabs.consumer.model.diverse;

import no.fint.model.resource.administrasjon.kodeverk.DiverseResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class DiverseRequestKafkaConsumer extends EventRequestKafkaConsumer<DiverseResource> {
    public DiverseRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, DiverseConfig diverseConfig) {
        super(eventConsumerFactoryService, diverseConfig);
    }
}
