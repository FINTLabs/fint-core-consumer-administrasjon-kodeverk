package no.fintlabs.consumer.model.arbeidsforholdstype;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.ArbeidsforholdstypeResource;
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
@RequestMapping(name = "Arbeidsforholdstype", value = RestEndpoints.ARBEIDSFORHOLDSTYPE, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class ArbeidsforholdstypeController extends WriteableConsumerRestController<ArbeidsforholdstypeResource> {

    public ArbeidsforholdstypeController(
            CacheService<ArbeidsforholdstypeResource> cacheService,
            ArbeidsforholdstypeLinker fintLinker,
            ArbeidsforholdstypeConfig arbeidsforholdstypeConfig,
            ArbeidsforholdstypeEventKafkaProducer arbeidsforholdstypeEventKafkaProducer,
            ArbeidsforholdstypeResponseKafkaConsumer arbeidsforholdstypeResponseKafkaConsumer,
            FintFilterService odataFilterService,
            ArbeidsforholdstypeRequestKafkaConsumer arbeidsforholdstypeRequestKafkaConsumer) {
        super(cacheService, fintLinker, arbeidsforholdstypeConfig, arbeidsforholdstypeEventKafkaProducer, arbeidsforholdstypeResponseKafkaConsumer, odataFilterService, arbeidsforholdstypeRequestKafkaConsumer);
    }
}
