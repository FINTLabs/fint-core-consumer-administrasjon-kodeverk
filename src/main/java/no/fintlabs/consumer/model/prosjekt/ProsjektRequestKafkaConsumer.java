package no.fintlabs.consumer.model.prosjekt;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ProsjektRequestKafkaConsumer extends EventRequestKafkaConsumer<ProsjektResource> {
    public ProsjektRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ProsjektConfig prosjektConfig) {
        super(eventConsumerFactoryService, prosjektConfig);
    }
}
