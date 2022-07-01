package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Person p1=new Person("Jack1",20);
        Person p2=new Person("Jack2",21);
        Person p3=new Person("Jack3",22);
        Person p4=new Person("Jack4",23);

        Set<Person> people = new HashSet();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people);
        System.out.println("Jack2 in set: " +people.contains(p2));
        System.out.println("hashCode Jack2: " + p2.hashCode());
        p2.age=22;
        System.out.println(people);
        System.out.println("Jack2 in set: " +people.contains(p2));
        System.out.println("hashCode Jack2: " + p2.hashCode());



    }
}
