package no.fintlabs.consumer.model.stillingskode;

import no.fint.model.resource.administrasjon.kodeverk.StillingskodeResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class StillingskodeRequestKafkaConsumer extends EventRequestKafkaConsumer<StillingskodeResource> {
    public StillingskodeRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, StillingskodeConfig stillingskodeConfig) {
        super(eventConsumerFactoryService, stillingskodeConfig);
    }
}
