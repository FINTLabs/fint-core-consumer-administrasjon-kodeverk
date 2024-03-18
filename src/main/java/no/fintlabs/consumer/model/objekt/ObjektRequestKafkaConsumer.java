package no.fintlabs.consumer.model.objekt;

import no.fint.model.resource.administrasjon.kodeverk.ObjektResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class ObjektRequestKafkaConsumer extends EventRequestKafkaConsumer<ObjektResource> {
    public ObjektRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, ObjektConfig objektConfig) {
        super(eventConsumerFactoryService, objektConfig);
    }
}
