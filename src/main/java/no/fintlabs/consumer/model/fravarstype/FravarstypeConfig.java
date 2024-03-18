package no.fintlabs.consumer.model.fravarstype;

import no.fint.model.resource.administrasjon.kodeverk.FravarstypeResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class FravarstypeConfig extends ConsumerConfig<FravarstypeResource> {

    public FravarstypeConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "fravarstype";
    }
}
