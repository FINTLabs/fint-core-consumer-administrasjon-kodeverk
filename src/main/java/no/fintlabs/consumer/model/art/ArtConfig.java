package no.fintlabs.consumer.model.art;

import no.fint.model.resource.administrasjon.kodeverk.ArtResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class ArtConfig extends ConsumerConfig<ArtResource> {

    public ArtConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "art";
    }
}
