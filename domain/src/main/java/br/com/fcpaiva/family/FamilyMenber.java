package br.com.fcpaiva.domain;

import br.com.fcpaiva.AggregateRoot;
import br.com.fcpaiva.utils.FamilyID;

import java.time.Instant;

public class Family extends AggregateRoot<FamilyID>{

    private Strign nom;
    private String nomeConjunge;
    private  int pedendentes;
    private Instant createdAt;
    private Instant updatedAt;

    protected CastFamilya(
            final
    )