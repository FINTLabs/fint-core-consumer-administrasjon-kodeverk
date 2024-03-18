package no.fintlabs.consumer.model.personalressurskategori;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class PersonalressurskategoriEventKafkaProducer extends EventKafkaProducer {
    public PersonalressurskategoriEventKafkaProducer(EventProducerFactory eventProducerFactory, PersonalressurskategoriConfig personalressurskategoriConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, personalressurskategoriConfig, eventTopicService);
    }
}
