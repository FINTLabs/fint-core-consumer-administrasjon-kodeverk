package no.fintlabs.consumer.model.funksjon;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.FunksjonResource;
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
@RequestMapping(name = "Funksjon", value = RestEndpoints.FUNKSJON, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class FunksjonController extends WriteableConsumerRestController<FunksjonResource> {

    public FunksjonController(
            CacheService<FunksjonResource> cacheService,
            FunksjonLinker fintLinker,
            FunksjonConfig funksjonConfig,
            FunksjonEventKafkaProducer funksjonEventKafkaProducer,
            FunksjonResponseKafkaConsumer funksjonResponseKafkaConsumer,
            FintFilterService odataFilterService,
            FunksjonRequestKafkaConsumer funksjonRequestKafkaConsumer) {
        super(cacheService, fintLinker, funksjonConfig, funksjonEventKafkaProducer, funksjonResponseKafkaConsumer, odataFilterService, funksjonRequestKafkaConsumer);
    }
}
