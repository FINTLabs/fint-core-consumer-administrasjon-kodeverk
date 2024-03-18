package no.fintlabs.consumer.model.stillingskode;

import no.fint.model.resource.administrasjon.kodeverk.StillingskodeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class StillingskodeResponseKafkaConsumer extends EventResponseKafkaConsumer<StillingskodeResource> {

    public StillingskodeResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, StillingskodeConfig stillingskodeConfig, StillingskodeLinker stillingskodeLinker) {
        super(eventConsumerFactoryService, stillingskodeConfig, stillingskodeLinker);
    }

}
