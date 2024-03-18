package no.fintlabs.consumer.model.personalressurskategori;

import no.fint.model.resource.administrasjon.kodeverk.PersonalressurskategoriResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class PersonalressurskategoriConfig extends ConsumerConfig<PersonalressurskategoriResource> {

    public PersonalressurskategoriConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "personalressurskategori";
    }
}
