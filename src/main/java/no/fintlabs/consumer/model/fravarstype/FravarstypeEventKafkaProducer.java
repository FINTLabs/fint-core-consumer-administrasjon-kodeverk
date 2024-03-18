package no.fintlabs.consumer.model.fravarstype;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class FravarstypeEventKafkaProducer extends EventKafkaProducer {
    public FravarstypeEventKafkaProducer(EventProducerFactory eventProducerFactory, FravarstypeConfig fravarstypeConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, fravarstypeConfig, eventTopicService);
    }
}
