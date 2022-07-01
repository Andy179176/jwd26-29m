package com.company;

import java.util.stream.IntStream;

public class Person implements Comparable<Person> {

    private String name;


    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
