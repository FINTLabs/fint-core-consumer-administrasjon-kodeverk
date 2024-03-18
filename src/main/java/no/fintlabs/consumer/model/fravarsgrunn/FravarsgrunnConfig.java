package no.fintlabs.consumer.model.fravarsgrunn;

import no.fint.model.resource.administrasjon.kodeverk.FravarsgrunnResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class FravarsgrunnConfig extends ConsumerConfig<FravarsgrunnResource> {

    public FravarsgrunnConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "fravarsgrunn";
    }
}
