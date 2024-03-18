package no.fintlabs.consumer.model.aktivitet;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class AktivitetEventKafkaProducer extends EventKafkaProducer {
    public AktivitetEventKafkaProducer(EventProducerFactory eventProducerFactory, AktivitetConfig aktivitetConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, aktivitetConfig, eventTopicService);
    }
}
