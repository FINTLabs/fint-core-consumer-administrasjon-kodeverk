package no.fintlabs.consumer.model.prosjektart;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.ProsjektartResource;
import no.fint.relations.FintRelationsMediaType;
import no.fintlabs.consumer.config.RestEndpoints;
import no.fintlabs.core.consumer.shared.resource.CacheService;
import no.fintlabs.core.consumer.shared.resource.WriteableConsumerRestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(name = "Prosjektart", value = RestEndpoints.PROSJEKTART, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class ProsjektartController extends WriteableConsumerRestController<ProsjektartResource> {

    public ProsjektartController(
            CacheService<ProsjektartResource> cacheService,
            ProsjektartLinker fintLinker,
            ProsjektartConfig prosjektartConfig,
            ProsjektartEventKafkaProducer prosjektartEventKafkaProducer,
            ProsjektartResponseKafkaConsumer prosjektartResponseKafkaConsumer,
            FintFilterService odataFilterService,
            ProsjektartRequestKafkaConsumer prosjektartRequestKafkaConsumer) {
        super(cacheService, fintLinker, prosjektartConfig, prosjektartEventKafkaProducer, prosjektartResponseKafkaConsumer, odataFilterService, prosjektartRequestKafkaConsumer);
    }
}
