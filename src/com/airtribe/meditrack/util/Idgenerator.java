package com.airtribe.meditrack.util;

public class Idgenerator {
    private static final Idgenerator INSTANCE = new Idgenerator();
    private int counter = 100;

    private Idgenerator() {}

    public static Idgenerator getINSTANCE() {
        return INSTANCE;
    }

    public static Idgenerator getInstance() {
    return null;
    }

    public synchronized String generateId() {

        return "ID" + counter++;
    }
}
