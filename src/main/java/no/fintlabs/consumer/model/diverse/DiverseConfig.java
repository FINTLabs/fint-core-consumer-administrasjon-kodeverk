package no.fintlabs.consumer.model.diverse;

import no.fint.model.resource.administrasjon.kodeverk.DiverseResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class DiverseConfig extends ConsumerConfig<DiverseResource> {

    public DiverseConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "diverse";
    }
}
