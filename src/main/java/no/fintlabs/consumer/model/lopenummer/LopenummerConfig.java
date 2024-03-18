package no.fintlabs.consumer.model.lopenummer;

import no.fint.model.resource.administrasjon.kodeverk.LopenummerResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class LopenummerConfig extends ConsumerConfig<LopenummerResource> {

    public LopenummerConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "lopenummer";
    }
}
