package no.fintlabs.consumer.model.aktivitet;

import no.fint.model.resource.administrasjon.kodeverk.AktivitetResource;
import no.fint.model.resource.administrasjon.kodeverk.AktivitetResources;
import no.fint.relations.FintLinker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

@Component
public class AktivitetLinker extends FintLinker<AktivitetResource> {

    public AktivitetLinker() {
        super(AktivitetResource.class);
    }

    public void mapLinks(AktivitetResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public AktivitetResources toResources(Collection<AktivitetResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public AktivitetResources toResources(Stream<AktivitetResource> stream, int offset, int size, int totalItems) {
        AktivitetResources resources = new AktivitetResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(AktivitetResource resource) {
        return getAllSelfHrefs(resource).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(AktivitetResource resource) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(resource.getSystemId().getIdentifikatorverdi(), "systemid"));
        }

        return builder.build();
    }

    int[] hashCodes(AktivitetResource resource) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(resource.getSystemId().getIdentifikatorverdi().hashCode());
        }

        return builder.build().toArray();
    }
}