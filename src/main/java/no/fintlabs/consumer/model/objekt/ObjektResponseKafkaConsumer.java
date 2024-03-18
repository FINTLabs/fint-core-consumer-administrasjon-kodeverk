package no.fintlabs.consumer.model.objekt;

import no.fint.model.resource.administrasjon.kodeverk.ObjektResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ObjektResponseKafkaConsumer extends EventResponseKafkaConsumer<ObjektResource> {

    public ObjektResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ObjektConfig objektConfig, ObjektLinker objektLinker) {
        super(eventConsumerFactoryService, objektConfig, objektLinker);
    }

}
