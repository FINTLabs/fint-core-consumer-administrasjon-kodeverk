package no.fintlabs.consumer.model.ansvar;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class AnsvarEventKafkaProducer extends EventKafkaProducer {
    public AnsvarEventKafkaProducer(EventProducerFactory eventProducerFactory, AnsvarConfig ansvarConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, ansvarConfig, eventTopicService);
    }
}
