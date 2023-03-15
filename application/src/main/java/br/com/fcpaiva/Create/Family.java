package br.com.fcpaiva.Create;

import java.util.List;

public record  CreateFamilyCommand(
        String nomePai,
        String nomaMae,
        boolean isActive
) {\

    public static CreateFamilyCommand with(
            final String aName,
            final String aDescription,
            final List<DEpen> isActivex
    ) {
        return new CreateFamilyCommand(aName, aDescription, isActive);
    }
}
