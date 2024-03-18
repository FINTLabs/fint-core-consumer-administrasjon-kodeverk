package no.fintlabs.consumer.model.objekt;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class ObjektEventKafkaProducer extends EventKafkaProducer {
    public ObjektEventKafkaProducer(EventProducerFactory eventProducerFactory, ObjektConfig objektConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, objektConfig, eventTopicService);
    }
}
