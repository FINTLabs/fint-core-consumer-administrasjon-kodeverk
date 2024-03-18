package no.fintlabs.consumer.model.lopenummer;

import no.fint.model.resource.administrasjon.kodeverk.LopenummerResource;
import no.fint.model.resource.administrasjon.kodeverk.LopenummerResources;
import no.fint.relations.FintLinker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

@Component
public class LopenummerLinker extends FintLinker<LopenummerResource> {

    public LopenummerLinker() {
        super(LopenummerResource.class);
    }

    public void mapLinks(LopenummerResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public LopenummerResources toResources(Collection<LopenummerResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public LopenummerResources toResources(Stream<LopenummerResource> stream, int offset, int size, int totalItems) {
        LopenummerResources resources = new LopenummerResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(LopenummerResource resource) {
        return getAllSelfHrefs(resource).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(LopenummerResource resource) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(resource.getSystemId().getIdentifikatorverdi(), "systemid"));
        }

        return builder.build();
    }

    int[] hashCodes(LopenummerResource resource) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(resource.getSystemId()) && !StringUtils.isEmpty(resource.getSystemId().getIdentifikatorverdi())) {
            builder.add(resource.getSystemId().getIdentifikatorverdi().hashCode());
        }

        return builder.build().toArray();
    }
}