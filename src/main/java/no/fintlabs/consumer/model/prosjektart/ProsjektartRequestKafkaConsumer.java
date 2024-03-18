package no.fintlabs.consumer.model.prosjektart;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektartResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektartRequestKafkaConsumer extends EventRequestKafkaConsumer<ProsjektartResource> {
    public ProsjektartRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ProsjektartConfig prosjektartConfig) {
        super(eventConsumerFactoryService, prosjektartConfig);
    }
}
