package no.fintlabs.consumer.model.stillingskode;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class StillingskodeEventKafkaProducer extends EventKafkaProducer {
    public StillingskodeEventKafkaProducer(EventProducerFactory eventProducerFactory, StillingskodeConfig stillingskodeConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, stillingskodeConfig, eventTopicService);
    }
}
