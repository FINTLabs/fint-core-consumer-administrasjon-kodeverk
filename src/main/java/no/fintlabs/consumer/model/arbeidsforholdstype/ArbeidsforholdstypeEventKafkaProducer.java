package no.fintlabs.consumer.model.arbeidsforholdstype;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class ArbeidsforholdstypeEventKafkaProducer extends EventKafkaProducer {
    public ArbeidsforholdstypeEventKafkaProducer(EventProducerFactory eventProducerFactory, ArbeidsforholdstypeConfig arbeidsforholdstypeConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, arbeidsforholdstypeConfig, eventTopicService);
    }
}
