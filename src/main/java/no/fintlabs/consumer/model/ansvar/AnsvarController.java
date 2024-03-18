package no.fintlabs.consumer.model.ansvar;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.AnsvarResource;
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
@RequestMapping(name = "Ansvar", value = RestEndpoints.ANSVAR, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class AnsvarController extends WriteableConsumerRestController<AnsvarResource> {

    public AnsvarController(
            CacheService<AnsvarResource> cacheService,
            AnsvarLinker fintLinker,
            AnsvarConfig ansvarConfig,
            AnsvarEventKafkaProducer ansvarEventKafkaProducer,
            AnsvarResponseKafkaConsumer ansvarResponseKafkaConsumer,
            FintFilterService odataFilterService,
            AnsvarRequestKafkaConsumer ansvarRequestKafkaConsumer) {
        super(cacheService, fintLinker, ansvarConfig, ansvarEventKafkaProducer, ansvarResponseKafkaConsumer, odataFilterService, ansvarRequestKafkaConsumer);
    }
}
