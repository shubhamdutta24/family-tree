package com.collectorawas.familytree.model.core;

import com.collectorawas.familytree.ennumeration.Colour;
import com.collectorawas.familytree.ennumeration.Gender;
import com.collectorawas.familytree.model.core.members.Name;
import com.collectorawas.familytree.model.user.User;

import java.util.List;

public class Person {
    private Long id;
    private User user;

    private Name name;
    private Gender gender;
    private Colour colour;

    private Person father;
    private Person mother;

    private Person spouse;

    private List<Person> children;
}
