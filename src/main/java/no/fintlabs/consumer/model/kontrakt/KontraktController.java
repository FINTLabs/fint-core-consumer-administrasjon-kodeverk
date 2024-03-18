package no.fintlabs.consumer.model.kontrakt;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.KontraktResource;
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
@RequestMapping(name = "Kontrakt", value = RestEndpoints.KONTRAKT, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class KontraktController extends WriteableConsumerRestController<KontraktResource> {

    public KontraktController(
            CacheService<KontraktResource> cacheService,
            KontraktLinker fintLinker,
            KontraktConfig kontraktConfig,
            KontraktEventKafkaProducer kontraktEventKafkaProducer,
            KontraktResponseKafkaConsumer kontraktResponseKafkaConsumer,
            FintFilterService odataFilterService,
            KontraktRequestKafkaConsumer kontraktRequestKafkaConsumer) {
        super(cacheService, fintLinker, kontraktConfig, kontraktEventKafkaProducer, kontraktResponseKafkaConsumer, odataFilterService, kontraktRequestKafkaConsumer);
    }
}
