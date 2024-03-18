package no.fintlabs.consumer.model.ansvar;

import no.fint.model.resource.administrasjon.kodeverk.AnsvarResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class AnsvarConfig extends ConsumerConfig<AnsvarResource> {

    public AnsvarConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "ansvar";
    }
}
