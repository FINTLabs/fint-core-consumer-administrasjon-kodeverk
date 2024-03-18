package no.fintlabs.consumer.model.lonnsart;

import no.fint.model.resource.administrasjon.kodeverk.LonnsartResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class LonnsartRequestKafkaConsumer extends EventRequestKafkaConsumer<LonnsartResource> {
    public LonnsartRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, LonnsartConfig lonnsartConfig) {
        super(eventConsumerFactoryService, lonnsartConfig);
    }
}
