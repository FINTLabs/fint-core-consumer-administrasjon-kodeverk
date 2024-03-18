package no.fintlabs.consumer.model.diverse;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.DiverseResource;
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
@RequestMapping(name = "Diverse", value = RestEndpoints.DIVERSE, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class DiverseController extends WriteableConsumerRestController<DiverseResource> {

    public DiverseController(
            CacheService<DiverseResource> cacheService,
            DiverseLinker fintLinker,
            DiverseConfig diverseConfig,
            DiverseEventKafkaProducer diverseEventKafkaProducer,
            DiverseResponseKafkaConsumer diverseResponseKafkaConsumer,
            FintFilterService odataFilterService,
            DiverseRequestKafkaConsumer diverseRequestKafkaConsumer) {
        super(cacheService, fintLinker, diverseConfig, diverseEventKafkaProducer, diverseResponseKafkaConsumer, odataFilterService, diverseRequestKafkaConsumer);
    }
}
