package no.fintlabs.consumer.model.ramme;

import no.fint.model.resource.administrasjon.kodeverk.RammeResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class RammeConfig extends ConsumerConfig<RammeResource> {

    public RammeConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "ramme";
    }
}
