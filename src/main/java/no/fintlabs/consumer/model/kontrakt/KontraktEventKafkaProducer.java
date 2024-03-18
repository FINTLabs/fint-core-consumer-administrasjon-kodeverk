package no.fintlabs.consumer.model.kontrakt;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class KontraktEventKafkaProducer extends EventKafkaProducer {
    public KontraktEventKafkaProducer(EventProducerFactory eventProducerFactory, KontraktConfig kontraktConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, kontraktConfig, eventTopicService);
    }
}
