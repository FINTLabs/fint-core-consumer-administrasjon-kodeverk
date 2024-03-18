package no.fintlabs.consumer.model.funksjon;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class FunksjonEventKafkaProducer extends EventKafkaProducer {
    public FunksjonEventKafkaProducer(EventProducerFactory eventProducerFactory, FunksjonConfig funksjonConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, funksjonConfig, eventTopicService);
    }
}
