package no.fintlabs.consumer.model.aktivitet;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.AktivitetResource;
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
@RequestMapping(name = "Aktivitet", value = RestEndpoints.AKTIVITET, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class AktivitetController extends WriteableConsumerRestController<AktivitetResource> {

    public AktivitetController(
            CacheService<AktivitetResource> cacheService,
            AktivitetLinker fintLinker,
            AktivitetConfig aktivitetConfig,
            AktivitetEventKafkaProducer aktivitetEventKafkaProducer,
            AktivitetResponseKafkaConsumer aktivitetResponseKafkaConsumer,
            FintFilterService odataFilterService,
            AktivitetRequestKafkaConsumer aktivitetRequestKafkaConsumer) {
        super(cacheService, fintLinker, aktivitetConfig, aktivitetEventKafkaProducer, aktivitetResponseKafkaConsumer, odataFilterService, aktivitetRequestKafkaConsumer);
    }
}
