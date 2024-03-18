package no.fintlabs.consumer.model.anlegg;

import no.fint.model.resource.administrasjon.kodeverk.AnleggResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class AnleggResponseKafkaConsumer extends EventResponseKafkaConsumer<AnleggResource> {

    public AnleggResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, AnleggConfig anleggConfig, AnleggLinker anleggLinker) {
        super(eventConsumerFactoryService, anleggConfig, anleggLinker);
    }

}
