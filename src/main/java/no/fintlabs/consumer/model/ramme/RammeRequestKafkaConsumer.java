package no.fintlabs.consumer.model.ramme;

import no.fint.model.resource.administrasjon.kodeverk.RammeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class RammeRequestKafkaConsumer extends EventRequestKafkaConsumer<RammeResource> {
    public RammeRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, RammeConfig rammeConfig) {
        super(eventConsumerFactoryService, rammeConfig);
    }
}
