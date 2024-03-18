package no.fintlabs.consumer.config;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class LinkMapper {

    public static Map<String, String> linkMapper() {
        return ImmutableMap.<String, String>builder()
                .put("no.fint.model.administrasjon.personal.Aktivitet", "/administrasjon/personal/aktivitet")
                .put("no.fint.model.administrasjon.personal.Anlegg", "/administrasjon/personal/anlegg")
                .put("no.fint.model.administrasjon.personal.Ansvar", "/administrasjon/personal/ansvar")
                .put("no.fint.model.administrasjon.personal.Arbeidsforholdstype", "/administrasjon/personal/arbeidsforholdstype")
                .put("no.fint.model.administrasjon.personal.Art", "/administrasjon/personal/art")
                .put("no.fint.model.administrasjon.personal.Diverse", "/administrasjon/personal/diverse")
                .put("no.fint.model.administrasjon.personal.Formal", "/administrasjon/personal/formal")
                .put("no.fint.model.administrasjon.personal.Fravarsgrunn", "/administrasjon/personal/fravarsgrunn")
                .put("no.fint.model.administrasjon.personal.Fravarstype", "/administrasjon/personal/fravarstype")
                .put("no.fint.model.administrasjon.personal.Funksjon", "/administrasjon/personal/funksjon")
                .put("no.fint.model.administrasjon.personal.Kontrakt", "/administrasjon/personal/kontrakt")
                .put("no.fint.model.administrasjon.personal.Lonnsart", "/administrasjon/personal/lonnsart")
                .put("no.fint.model.administrasjon.personal.Lopenummer", "/administrasjon/personal/lopenummer")
                .put("no.fint.model.administrasjon.personal.Objekt", "/administrasjon/personal/objekt")
                .put("no.fint.model.administrasjon.personal.Personalressurskategori", "/administrasjon/personal/personalressurskategori")
                .put("no.fint.model.administrasjon.personal.Prosjekt", "/administrasjon/personal/prosjekt")
                .put("no.fint.model.administrasjon.personal.Prosjektart", "/administrasjon/personal/prosjektart")
                .put("no.fint.model.administrasjon.personal.Ramme", "/administrasjon/personal/ramme")
                .put("no.fint.model.administrasjon.personal.Stillingskode", "/administrasjon/personal/stillingskode")
                .put("no.fint.model.administrasjon.personal.Uketimetall", "/administrasjon/personal/uketimetall")
                .build();
    }

}
