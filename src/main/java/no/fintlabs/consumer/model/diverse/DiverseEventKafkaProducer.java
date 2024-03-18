package no.fintlabs.consumer.model.diverse;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class DiverseEventKafkaProducer extends EventKafkaProducer {
    public DiverseEventKafkaProducer(EventProducerFactory eventProducerFactory, DiverseConfig diverseConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, diverseConfig, eventTopicService);
    }
}
