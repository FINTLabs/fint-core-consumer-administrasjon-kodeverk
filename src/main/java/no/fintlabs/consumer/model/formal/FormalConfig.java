package no.fintlabs.consumer.model.formal;

import no.fint.model.resource.administrasjon.kodeverk.FormalResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class FormalConfig extends ConsumerConfig<FormalResource> {

    public FormalConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "formal";
    }
}
