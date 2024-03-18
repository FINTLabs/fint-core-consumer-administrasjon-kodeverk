package no.fintlabs.consumer.model.formal;

import no.fint.model.resource.administrasjon.kodeverk.FormalResource;
import no.fint.model.resource.administrasjon.kodeverk.FormalResources;
import no.fint.relations.FintLinker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

@Component
public class FormalLinker extends FintLinker<FormalResource> {

    public FormalLinker() {
        super(FormalResource.class);
    }

    public void mapLinks(FormalResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public FormalResources toResources(Collection<FormalResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public FormalResources toResources(Stream<FormalResource> stream, int offset, int size, int totalItems) {
        FormalResources resources = new FormalResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(FormalResource resource) {
        return getAllSelfHrefs(resource).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(FormalResource resource) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(resource.getSystemId().getIdentifikatorverdi(), "systemid"));
        }

        return builder.build();
    }

    int[] hashCodes(FormalResource resource) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(resource.getSystemId().getIdentifikatorverdi().hashCode());
        }

        return builder.build().toArray();
    }
}