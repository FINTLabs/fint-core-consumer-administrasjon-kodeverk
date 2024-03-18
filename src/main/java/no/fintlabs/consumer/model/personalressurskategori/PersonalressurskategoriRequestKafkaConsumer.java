package no.fintlabs.consumer.model.personalressurskategori;

import no.fint.model.resource.administrasjon.kodeverk.PersonalressurskategoriResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class PersonalressurskategoriRequestKafkaConsumer extends EventRequestKafkaConsumer<PersonalressurskategoriResource> {
    public PersonalressurskategoriRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, PersonalressurskategoriConfig personalressurskategoriConfig) {
        super(eventConsumerFactoryService, personalressurskategoriConfig);
    }
}
