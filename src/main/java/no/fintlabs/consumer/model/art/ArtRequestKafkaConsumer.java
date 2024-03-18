package no.fintlabs.consumer.model.art;

import no.fint.model.resource.administrasjon.kodeverk.ArtResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ArtRequestKafkaConsumer extends EventRequestKafkaConsumer<ArtResource> {
    public ArtRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ArtConfig artConfig) {
        super(eventConsumerFactoryService, artConfig);
    }
}
