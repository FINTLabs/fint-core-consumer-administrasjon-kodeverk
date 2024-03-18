package no.fintlabs.consumer.model.lonnsart;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class LonnsartEventKafkaProducer extends EventKafkaProducer {
    public LonnsartEventKafkaProducer(EventProducerFactory eventProducerFactory, LonnsartConfig lonnsartConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, lonnsartConfig, eventTopicService);
    }
}
