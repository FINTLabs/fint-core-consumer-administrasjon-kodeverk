package no.fintlabs.consumer.model.prosjekt;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektResponseKafkaConsumer extends EventResponseKafkaConsumer<ProsjektResource> {

    public ProsjektResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ProsjektConfig prosjektConfig, ProsjektLinker prosjektLinker) {
        super(eventConsumerFactoryService, prosjektConfig, prosjektLinker);
    }

}
