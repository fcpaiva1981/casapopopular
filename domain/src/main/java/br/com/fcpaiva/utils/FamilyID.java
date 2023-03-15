package br.com.fcpaiva.utils;

import java.util.UUID;

public class FamilyID {
    private FamilyID() {
    }

    public static String uuid() {
        return UUID.randomUUID().toString().toLowerCase().replace("-", "");
    }
}
