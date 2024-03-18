package no.fintlabs.consumer.model.arbeidsforholdstype;

import no.fint.model.resource.administrasjon.kodeverk.ArbeidsforholdstypeResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class ArbeidsforholdstypeConfig extends ConsumerConfig<ArbeidsforholdstypeResource> {

    public ArbeidsforholdstypeConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "arbeidsforholdstype";
    }
}
