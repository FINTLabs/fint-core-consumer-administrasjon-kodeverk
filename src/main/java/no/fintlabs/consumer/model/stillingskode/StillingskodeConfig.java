package no.fintlabs.consumer.model.stillingskode;

import no.fint.model.resource.administrasjon.kodeverk.StillingskodeResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class StillingskodeConfig extends ConsumerConfig<StillingskodeResource> {

    public StillingskodeConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "stillingskode";
    }
}
