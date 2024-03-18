package no.fintlabs.consumer.model.ramme;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.RammeResource;
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
@RequestMapping(name = "Ramme", value = RestEndpoints.RAMME, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class RammeController extends WriteableConsumerRestController<RammeResource> {

    public RammeController(
            CacheService<RammeResource> cacheService,
            RammeLinker fintLinker,
            RammeConfig rammeConfig,
            RammeEventKafkaProducer rammeEventKafkaProducer,
            RammeResponseKafkaConsumer rammeResponseKafkaConsumer,
            FintFilterService odataFilterService,
            RammeRequestKafkaConsumer rammeRequestKafkaConsumer) {
        super(cacheService, fintLinker, rammeConfig, rammeEventKafkaProducer, rammeResponseKafkaConsumer, odataFilterService, rammeRequestKafkaConsumer);
    }
}
