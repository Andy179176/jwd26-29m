package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //Set<Integer> treeSet = new TreeSet<>();

        set.add(1);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(7);
        set.add(1);
        set.add(7);
        set.add(-4);
        set.add(10);
        set.add(-20);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);
        set.add(0);

        Set<String> setString= new HashSet<>();
        setString.add("11");
        setString.add("aa");
        setString.add("ll");
        for (String s:setString) {
            System.out.println(s);
        }
        System.out.println("size= "+set.size());
        System.out.println(set);
        set.remove(1);
        System.out.println(set.contains(100));

        System.out.println(set);
        System.out.println("------------");
        for (Integer i:set) {
            System.out.println(i);
        }
/*
        for (int i = 0; i < ; i++) {

        }

 */

        System.out.println("------person---------------");
        //Set<Person> people = new TreeSet<>();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack"));
        people.add(new Person("John"));
        people.add(new Person("Nick"));
        people.add(new Person("Jack"));

        Set<Person> people1= new HashSet<>(people);
        List<Person> list = new ArrayList<>(people1);
        System.out.println(people1);





    }
}
