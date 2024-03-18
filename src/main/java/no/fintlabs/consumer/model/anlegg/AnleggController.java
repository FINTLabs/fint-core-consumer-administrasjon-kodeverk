package no.fintlabs.consumer.model.anlegg;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.AnleggResource;
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
@RequestMapping(name = "Anlegg", value = RestEndpoints.ANLEGG, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class AnleggController extends WriteableConsumerRestController<AnleggResource> {

    public AnleggController(
            CacheService<AnleggResource> cacheService,
            AnleggLinker fintLinker,
            AnleggConfig anleggConfig,
            AnleggEventKafkaProducer anleggEventKafkaProducer,
            AnleggResponseKafkaConsumer anleggResponseKafkaConsumer,
            FintFilterService odataFilterService,
            AnleggRequestKafkaConsumer anleggRequestKafkaConsumer) {
        super(cacheService, fintLinker, anleggConfig, anleggEventKafkaProducer, anleggResponseKafkaConsumer, odataFilterService, anleggRequestKafkaConsumer);
    }
}
