package no.fintlabs.consumer.model.anlegg;

import no.fint.model.resource.administrasjon.kodeverk.AnleggResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class AnleggRequestKafkaConsumer extends EventRequestKafkaConsumer<AnleggResource> {
    public AnleggRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, AnleggConfig anleggConfig) {
        super(eventConsumerFactoryService, anleggConfig);
    }
}
