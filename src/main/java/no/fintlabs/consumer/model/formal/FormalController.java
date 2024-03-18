package no.fintlabs.consumer.model.formal;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.FormalResource;
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
@RequestMapping(name = "Formal", value = RestEndpoints.FORMAL, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class FormalController extends WriteableConsumerRestController<FormalResource> {

    public FormalController(
            CacheService<FormalResource> cacheService,
            FormalLinker fintLinker,
            FormalConfig formalConfig,
            FormalEventKafkaProducer formalEventKafkaProducer,
            FormalResponseKafkaConsumer formalResponseKafkaConsumer,
            FintFilterService odataFilterService,
            FormalRequestKafkaConsumer formalRequestKafkaConsumer) {
        super(cacheService, fintLinker, formalConfig, formalEventKafkaProducer, formalResponseKafkaConsumer, odataFilterService, formalRequestKafkaConsumer);
    }
}