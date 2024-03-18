package no.fintlabs.consumer.model.kontrakt;

import no.fint.model.resource.administrasjon.kodeverk.KontraktResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class KontraktConfig extends ConsumerConfig<KontraktResource> {

    public KontraktConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "kontrakt";
    }
}
