package no.fintlabs.consumer.model.prosjektart;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektartResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektartResponseKafkaConsumer extends EventResponseKafkaConsumer<ProsjektartResource> {

    public ProsjektartResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ProsjektartConfig prosjektartConfig, ProsjektartLinker prosjektartLinker) {
        super(eventConsumerFactoryService, prosjektartConfig, prosjektartLinker);
    }

}
