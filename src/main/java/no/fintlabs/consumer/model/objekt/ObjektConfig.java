package no.fintlabs.consumer.model.objekt;

import no.fint.model.resource.administrasjon.kodeverk.ObjektResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class ObjektConfig extends ConsumerConfig<ObjektResource> {

    public ObjektConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "objekt";
    }
}
