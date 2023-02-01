package com.collectorawas.familytree.model.core.members;

public class Name {
    private String title;

    private String firstName;
    private String middleName;
    private String lastName;

    private String surName;
    private String familyName;

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getNameWithSalutation() {
        return title + " " + firstName + " " + lastName;
    }
}
