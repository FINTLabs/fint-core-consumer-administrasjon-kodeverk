package no.fintlabs.consumer.model.prosjekt;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class ProsjektConfig extends ConsumerConfig<ProsjektResource> {

    public ProsjektConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "prosjekt";
    }
}
