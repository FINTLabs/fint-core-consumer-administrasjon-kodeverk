package no.fintlabs.consumer.model.fravarsgrunn;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.FravarsgrunnResource;
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
@RequestMapping(name = "Fravarsgrunn", value = RestEndpoints.FRAVARSGRUNN, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class FravarsgrunnController extends WriteableConsumerRestController<FravarsgrunnResource> {

    public FravarsgrunnController(
            CacheService<FravarsgrunnResource> cacheService,
            FravarsgrunnLinker fintLinker,
            FravarsgrunnConfig fravarsgrunnConfig,
            FravarsgrunnEventKafkaProducer fravarsgrunnEventKafkaProducer,
            FravarsgrunnResponseKafkaConsumer fravarsgrunnResponseKafkaConsumer,
            FintFilterService odataFilterService,
            FravarsgrunnRequestKafkaConsumer fravarsgrunnRequestKafkaConsumer) {
        super(cacheService, fintLinker, fravarsgrunnConfig, fravarsgrunnEventKafkaProducer, fravarsgrunnResponseKafkaConsumer, odataFilterService, fravarsgrunnRequestKafkaConsumer);
    }
}
