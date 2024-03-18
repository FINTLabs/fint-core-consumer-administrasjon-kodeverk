package no.fintlabs.consumer.model.uketimetall;

import no.fint.model.resource.administrasjon.kodeverk.UketimetallResource;
import no.fint.model.resource.administrasjon.kodeverk.UketimetallResources;
import no.fint.relations.FintLinker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

@Component
public class UketimetallLinker extends FintLinker<UketimetallResource> {

    public UketimetallLinker() {
        super(UketimetallResource.class);
    }

    public void mapLinks(UketimetallResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public UketimetallResources toResources(Collection<UketimetallResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public UketimetallResources toResources(Stream<UketimetallResource> stream, int offset, int size, int totalItems) {
        UketimetallResources resources = new UketimetallResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(UketimetallResource resource) {
        return getAllSelfHrefs(resource).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(UketimetallResource resource) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(resource.getSystemId().getIdentifikatorverdi(), "systemid"));
        }

        return builder.build();
    }

    int[] hashCodes(UketimetallResource resource) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(resource.getSystemId().getIdentifikatorverdi().hashCode());
        }

        return builder.build().toArray();
    }
}