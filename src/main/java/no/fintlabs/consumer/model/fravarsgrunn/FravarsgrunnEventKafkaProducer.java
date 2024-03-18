package no.fintlabs.consumer.model.fravarsgrunn;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class FravarsgrunnEventKafkaProducer extends EventKafkaProducer {
    public FravarsgrunnEventKafkaProducer(EventProducerFactory eventProducerFactory, FravarsgrunnConfig fravarsgrunnConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, fravarsgrunnConfig, eventTopicService);
    }
}
