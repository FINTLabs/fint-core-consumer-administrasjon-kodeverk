package no.fintlabs.consumer.model.lonnsart;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.LonnsartResource;
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
@RequestMapping(name = "Lonnsart", value = RestEndpoints.LONNSART, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class LonnsartController extends WriteableConsumerRestController<LonnsartResource> {

    public LonnsartController(
            CacheService<LonnsartResource> cacheService,
            LonnsartLinker fintLinker,
            LonnsartConfig lonnsartConfig,
            LonnsartEventKafkaProducer lonnsartEventKafkaProducer,
            LonnsartResponseKafkaConsumer lonnsartResponseKafkaConsumer,
            FintFilterService odataFilterService,
            LonnsartRequestKafkaConsumer lonnsartRequestKafkaConsumer) {
        super(cacheService, fintLinker, lonnsartConfig, lonnsartEventKafkaProducer, lonnsartResponseKafkaConsumer, odataFilterService, lonnsartRequestKafkaConsumer);
    }
}
