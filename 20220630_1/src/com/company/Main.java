package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("5qwe");
        set.add("1qwe");
        set.add("7qwe");
        set.add("1qwe");
        set.add("2qwe2");
        set.add("1qwe");
        set.add("2qwe2");
        set.add("3qwe");

        System.out.println(set);

        Person p1= new Person("Jackwert");
        Person p2= new Person("John");

        TreeSet<Person> setPerson = new TreeSet<>(new Comparator1());
        setPerson.add(p1);
        setPerson.add(p2);
        setPerson.add(new Person("Jack"));
        setPerson.add(new Person("John"));
        setPerson.add(p1);
        System.out.println(setPerson);



    }
}
