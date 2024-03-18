package no.fintlabs.consumer.model.uketimetall;

import no.fint.model.resource.administrasjon.kodeverk.UketimetallResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class UketimetallRequestKafkaConsumer extends EventRequestKafkaConsumer<UketimetallResource> {
    public UketimetallRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, UketimetallConfig uketimetallConfig) {
        super(eventConsumerFactoryService, uketimetallConfig);
    }
}
