package no.fintlabs.consumer.model.anlegg;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class AnleggEventKafkaProducer extends EventKafkaProducer {
    public AnleggEventKafkaProducer(EventProducerFactory eventProducerFactory, AnleggConfig anleggConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, anleggConfig, eventTopicService);
    }
}
