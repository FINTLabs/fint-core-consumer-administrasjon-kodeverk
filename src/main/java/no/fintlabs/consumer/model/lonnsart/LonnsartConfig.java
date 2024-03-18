package no.fintlabs.consumer.model.lonnsart;

import no.fint.model.resource.administrasjon.kodeverk.LonnsartResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class LonnsartConfig extends ConsumerConfig<LonnsartResource> {

    public LonnsartConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "lonnsart";
    }
}
