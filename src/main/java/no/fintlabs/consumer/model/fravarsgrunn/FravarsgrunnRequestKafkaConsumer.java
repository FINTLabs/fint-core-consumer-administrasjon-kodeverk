package no.fintlabs.consumer.model.fravarsgrunn;

import no.fint.model.resource.administrasjon.kodeverk.FravarsgrunnResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FravarsgrunnRequestKafkaConsumer extends EventRequestKafkaConsumer<FravarsgrunnResource> {
    public FravarsgrunnRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FravarsgrunnConfig fravarsgrunnConfig) {
        super(eventConsumerFactoryService, fravarsgrunnConfig);
    }
}
