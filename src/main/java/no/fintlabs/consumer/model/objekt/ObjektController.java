package no.fintlabs.consumer.model.objekt;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.kodeverk.ObjektResource;
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
@RequestMapping(name = "Objekt", value = RestEndpoints.OBJEKT, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class ObjektController extends WriteableConsumerRestController<ObjektResource> {

    public ObjektController(
            CacheService<ObjektResource> cacheService,
            ObjektLinker fintLinker,
            ObjektConfig objektConfig,
            ObjektEventKafkaProducer objektEventKafkaProducer,
            ObjektResponseKafkaConsumer objektResponseKafkaConsumer,
            FintFilterService odataFilterService,
            ObjektRequestKafkaConsumer objektRequestKafkaConsumer) {
        super(cacheService, fintLinker, objektConfig, objektEventKafkaProducer, objektResponseKafkaConsumer, odataFilterService, objektRequestKafkaConsumer);
    }
}
