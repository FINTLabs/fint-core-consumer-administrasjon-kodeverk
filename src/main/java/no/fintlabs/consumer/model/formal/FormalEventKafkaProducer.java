package no.fintlabs.consumer.model.formal;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class FormalEventKafkaProducer extends EventKafkaProducer {
    public FormalEventKafkaProducer(EventProducerFactory eventProducerFactory, FormalConfig formalConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, formalConfig, eventTopicService);
    }
}
