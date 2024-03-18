package no.fintlabs.consumer.model.art;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class ArtEventKafkaProducer extends EventKafkaProducer {
    public ArtEventKafkaProducer(EventProducerFactory eventProducerFactory, ArtConfig artConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, artConfig, eventTopicService);
    }
}
