package no.fintlabs.consumer.model.personalressurskategori;

import no.fint.model.resource.administrasjon.kodeverk.PersonalressurskategoriResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class PersonalressurskategoriResponseKafkaConsumer extends EventResponseKafkaConsumer<PersonalressurskategoriResource> {

    public PersonalressurskategoriResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, PersonalressurskategoriConfig personalressurskategoriConfig, PersonalressurskategoriLinker personalressurskategoriLinker) {
        super(eventConsumerFactoryService, personalressurskategoriConfig, personalressurskategoriLinker);
    }

}
