package com.company;

public class Person extends Car {
    String name;

    public Person(String name)  {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
