package no.fintlabs.consumer.model.uketimetall;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class UketimetallEventKafkaProducer extends EventKafkaProducer {
    public UketimetallEventKafkaProducer(EventProducerFactory eventProducerFactory, UketimetallConfig uketimetallConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, uketimetallConfig, eventTopicService);
    }
}
