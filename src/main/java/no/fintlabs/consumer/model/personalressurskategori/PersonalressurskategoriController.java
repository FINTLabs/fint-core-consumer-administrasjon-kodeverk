package no.fintlabs.consumer.model.personalressurskategori;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.AnleggResource;
import no.fint.model.resource.administrasjon.kodeverk.PersonalressurskategoriResource;
import no.fint.relations.FintRelationsMediaType;
import no.fintlabs.consumer.config.RestEndpoints;
import no.fintlabs.core.consumer.shared.resource.CacheService;
import no.fintlabs.core.consumer.shared.resource.ConsumerRestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(name = "Personalressurskategori", value = RestEndpoints.PERSONALRESSURSKATEGORI, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class PersonalressurskategoriController extends ConsumerRestController<PersonalressurskategoriResource> {

    public PersonalressurskategoriController(
            CacheService<PersonalressurskategoriResource> cacheService,
            PersonalressurskategoriLinker fintLinker,
            FintFilterService odataFilterService) {
        super(cacheService, fintLinker, odataFilterService);
    }

    @PostConstruct
    private void registerIdentificators() {
        super.registerIdenficatorHandler("systemid", PersonalressurskategoriResource::getSystemId);
    }
}
