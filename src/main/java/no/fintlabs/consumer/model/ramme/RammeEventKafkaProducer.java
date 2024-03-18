package no.fintlabs.consumer.model.ramme;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class RammeEventKafkaProducer extends EventKafkaProducer {
    public RammeEventKafkaProducer(EventProducerFactory eventProducerFactory, RammeConfig rammeConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, rammeConfig, eventTopicService);
    }
}
