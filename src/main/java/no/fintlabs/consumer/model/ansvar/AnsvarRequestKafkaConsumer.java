package no.fintlabs.consumer.model.ansvar;

import no.fint.model.resource.administrasjon.kodeverk.AnsvarResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class AnsvarRequestKafkaConsumer extends EventRequestKafkaConsumer<AnsvarResource> {
    public AnsvarRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, AnsvarConfig ansvarConfig) {
        super(eventConsumerFactoryService, ansvarConfig);
    }
}
