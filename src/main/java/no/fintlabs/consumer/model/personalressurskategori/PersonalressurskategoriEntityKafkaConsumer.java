package no.fintlabs.consumer.model.personalressurskategori;

import no.fint.model.resource.administrasjon.kodeverk.PersonalressurskategoriResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class PersonalressurskategoriEntityKafkaConsumer extends EntityKafkaConsumer<PersonalressurskategoriResource> {

    public PersonalressurskategoriEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            PersonalressurskategoriConfig personalressurskategoriConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, personalressurskategoriConfig);
    }
}
