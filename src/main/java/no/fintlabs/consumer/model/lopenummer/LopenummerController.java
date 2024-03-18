package no.fintlabs.consumer.model.lopenummer;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.LopenummerResource;
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
@RequestMapping(name = "Lopenummer", value = RestEndpoints.LOPENUMMER, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class LopenummerController extends WriteableConsumerRestController<LopenummerResource> {

    public LopenummerController(
            CacheService<LopenummerResource> cacheService,
            LopenummerLinker fintLinker,
            LopenummerConfig lopenummerConfig,
            LopenummerEventKafkaProducer lopenummerEventKafkaProducer,
            LopenummerResponseKafkaConsumer lopenummerResponseKafkaConsumer,
            FintFilterService odataFilterService,
            LopenummerRequestKafkaConsumer lopenummerRequestKafkaConsumer) {
        super(cacheService, fintLinker, lopenummerConfig, lopenummerEventKafkaProducer, lopenummerResponseKafkaConsumer, odataFilterService, lopenummerRequestKafkaConsumer);
    }
}
