package no.fintlabs.consumer.model.lopenummer;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class LopenummerEventKafkaProducer extends EventKafkaProducer {
    public LopenummerEventKafkaProducer(EventProducerFactory eventProducerFactory, LopenummerConfig lopenummerConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, lopenummerConfig, eventTopicService);
    }
}
