package no.fintlabs.consumer.model.aktivitet;

import no.fint.model.resource.administrasjon.kodeverk.AktivitetResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class AktivitetConfig extends ConsumerConfig<AktivitetResource> {

    public AktivitetConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "aktivitet";
    }
}
