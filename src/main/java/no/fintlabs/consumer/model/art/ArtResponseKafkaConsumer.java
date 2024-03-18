package no.fintlabs.consumer.model.art;

import no.fint.model.resource.administrasjon.kodeverk.ArtResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ArtResponseKafkaConsumer extends EventResponseKafkaConsumer<ArtResource> {

    public ArtResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ArtConfig artConfig, ArtLinker artLinker) {
        super(eventConsumerFactoryService, artConfig, artLinker);
    }

}
