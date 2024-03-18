package no.fintlabs.consumer.model.lopenummer;

import no.fint.model.resource.administrasjon.kodeverk.LopenummerResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class LopenummerRequestKafkaConsumer extends EventRequestKafkaConsumer<LopenummerResource> {
    public LopenummerRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, LopenummerConfig lopenummerConfig) {
        super(eventConsumerFactoryService, lopenummerConfig);
    }
}
