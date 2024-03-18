package no.fintlabs.consumer.model.lopenummer;

import no.fint.model.resource.administrasjon.kodeverk.LopenummerResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class LopenummerResponseKafkaConsumer extends EventResponseKafkaConsumer<LopenummerResource> {

    public LopenummerResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, LopenummerConfig lopenummerConfig, LopenummerLinker lopenummerLinker) {
        super(eventConsumerFactoryService, lopenummerConfig, lopenummerLinker);
    }

}
