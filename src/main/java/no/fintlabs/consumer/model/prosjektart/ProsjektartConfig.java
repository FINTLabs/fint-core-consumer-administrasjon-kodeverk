package no.fintlabs.consumer.model.prosjektart;

import no.fint.model.resource.administrasjon.kodeverk.ProsjektartResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class ProsjektartConfig extends ConsumerConfig<ProsjektartResource> {

    public ProsjektartConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "prosjektart";
    }
}
