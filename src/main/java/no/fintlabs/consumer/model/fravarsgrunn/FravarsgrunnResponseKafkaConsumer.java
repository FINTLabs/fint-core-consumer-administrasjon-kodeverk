package no.fintlabs.consumer.model.fravarsgrunn;

import no.fint.model.resource.administrasjon.kodeverk.FravarsgrunnResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FravarsgrunnResponseKafkaConsumer extends EventResponseKafkaConsumer<FravarsgrunnResource> {

    public FravarsgrunnResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FravarsgrunnConfig fravarsgrunnConfig, FravarsgrunnLinker fravarsgrunnLinker) {
        super(eventConsumerFactoryService, fravarsgrunnConfig, fravarsgrunnLinker);
    }

}
