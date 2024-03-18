package no.fintlabs.consumer.model.art;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.ArtResource;
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
@RequestMapping(name = "Art", value = RestEndpoints.ART, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class ArtController extends WriteableConsumerRestController<ArtResource> {

    public ArtController(
            CacheService<ArtResource> cacheService,
            ArtLinker fintLinker,
            ArtConfig artConfig,
            ArtEventKafkaProducer artEventKafkaProducer,
            ArtResponseKafkaConsumer artResponseKafkaConsumer,
            FintFilterService odataFilterService,
            ArtRequestKafkaConsumer artRequestKafkaConsumer) {
        super(cacheService, fintLinker, artConfig, artEventKafkaProducer, artResponseKafkaConsumer, odataFilterService, artRequestKafkaConsumer);
    }
}
