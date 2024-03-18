package no.fintlabs.consumer.model.prosjektart;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektartEventKafkaProducer extends EventKafkaProducer {
    public ProsjektartEventKafkaProducer(EventProducerFactory eventProducerFactory, ProsjektartConfig prosjektartConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, prosjektartConfig, eventTopicService);
    }
}
