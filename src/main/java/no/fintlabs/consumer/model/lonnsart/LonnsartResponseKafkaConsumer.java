package no.fintlabs.consumer.model.lonnsart;

import no.fint.model.resource.administrasjon.kodeverk.LonnsartResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class LonnsartResponseKafkaConsumer extends EventResponseKafkaConsumer<LonnsartResource> {

    public LonnsartResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, LonnsartConfig lonnsartConfig, LonnsartLinker lonnsartLinker) {
        super(eventConsumerFactoryService, lonnsartConfig, lonnsartLinker);
    }

}
