package no.fintlabs.consumer.model.ramme;

import no.fint.model.resource.administrasjon.kodeverk.RammeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class RammeResponseKafkaConsumer extends EventResponseKafkaConsumer<RammeResource> {

    public RammeResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, RammeConfig rammeConfig, RammeLinker rammeLinker) {
        super(eventConsumerFactoryService, rammeConfig, rammeLinker);
    }

}
