package br.com.fcpaiva.domain

import  br.com.fcpaiva.domain.Identifier;
import  br.com.fcpaiva.domain.utils.IdUtils;
import br.com.fcpaiva.utils.FamilyID;
import br.com.fcpaiva.utils.IdUtils;

import java.util.Objects;


public class FamilaMderID extends Identifier {

    private final String value;

    private FamilaMderID(final String anId) {
        Objects.requireNonNull(anId);
        this.value = anId;
    }

    public static FamilaMderID unique() {
        return FamilaMderID.from(IdUtils.uuid());
    }

    public static FamilaMderID from(final String anId) {
        return new FamilaMderID(anId);
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final FamilaMderID that = (FamilyID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
