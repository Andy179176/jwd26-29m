package com.company;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class Person implements Comparable<Person>{
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
