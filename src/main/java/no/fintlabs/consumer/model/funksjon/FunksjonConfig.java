package no.fintlabs.consumer.model.funksjon;

import no.fint.model.resource.administrasjon.kodeverk.FunksjonResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class FunksjonConfig extends ConsumerConfig<FunksjonResource> {

    public FunksjonConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "funksjon";
    }
}
