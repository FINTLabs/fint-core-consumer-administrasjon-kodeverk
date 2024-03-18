package no.fintlabs.consumer.model.ansvar;

import no.fint.model.resource.administrasjon.kodeverk.AnsvarResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class AnsvarResponseKafkaConsumer extends EventResponseKafkaConsumer<AnsvarResource> {

    public AnsvarResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, AnsvarConfig ansvarConfig, AnsvarLinker ansvarLinker) {
        super(eventConsumerFactoryService, ansvarConfig, ansvarLinker);
    }

}
