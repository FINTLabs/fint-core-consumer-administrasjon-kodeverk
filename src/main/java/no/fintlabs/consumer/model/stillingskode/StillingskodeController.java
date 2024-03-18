package no.fintlabs.consumer.model.stillingskode;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.StillingskodeResource;
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
@RequestMapping(name = "Stillingskode", value = RestEndpoints.STILLINGSKODE, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class StillingskodeController extends WriteableConsumerRestController<StillingskodeResource> {

    public StillingskodeController(
            CacheService<StillingskodeResource> cacheService,
            StillingskodeLinker fintLinker,
            StillingskodeConfig stillingskodeConfig,
            StillingskodeEventKafkaProducer stillingskodeEventKafkaProducer,
            StillingskodeResponseKafkaConsumer stillingskodeResponseKafkaConsumer,
            FintFilterService odataFilterService,
            StillingskodeRequestKafkaConsumer stillingskodeRequestKafkaConsumer) {
        super(cacheService, fintLinker, stillingskodeConfig, stillingskodeEventKafkaProducer, stillingskodeResponseKafkaConsumer, odataFilterService, stillingskodeRequestKafkaConsumer);
    }
}
