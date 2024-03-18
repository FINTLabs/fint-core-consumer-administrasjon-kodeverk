package no.fintlabs.consumer.model.prosjekt;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektEventKafkaProducer extends EventKafkaProducer {
    public ProsjektEventKafkaProducer(EventProducerFactory eventProducerFactory, ProsjektConfig prosjektConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, prosjektConfig, eventTopicService);
    }
}
