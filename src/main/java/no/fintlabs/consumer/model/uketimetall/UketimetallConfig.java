package no.fintlabs.consumer.model.uketimetall;

import no.fint.model.resource.administrasjon.kodeverk.UketimetallResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class UketimetallConfig extends ConsumerConfig<UketimetallResource> {

    public UketimetallConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "uketimetall";
    }
}
