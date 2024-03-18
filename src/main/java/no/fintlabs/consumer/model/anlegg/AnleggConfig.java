package no.fintlabs.consumer.model.anlegg;

import no.fint.model.resource.administrasjon.kodeverk.AnleggResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class AnleggConfig extends ConsumerConfig<AnleggResource> {

    public AnleggConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "anlegg";
    }
}
