package no.fintlabs.consumer.model.uketimetall;

import no.fint.model.resource.administrasjon.kodeverk.UketimetallResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class UketimetallResponseKafkaConsumer extends EventResponseKafkaConsumer<UketimetallResource> {

    public UketimetallResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, UketimetallConfig uketimetallConfig, UketimetallLinker uketimetallLinker) {
        super(eventConsumerFactoryService, uketimetallConfig, uketimetallLinker);
    }

}
