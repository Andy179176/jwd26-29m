package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> strings = List.of("     qwe qwe", null, "sadfsb", "sadfsb", " sdbfub sdfnu sdf", "sdbfyusf", "sdfsdf sqehwrh");

        Map<String, Integer> map= new HashMap<>();
        map.put("One", Integer.valueOf(1));
        map.put("Three", Integer.valueOf(3));

        Person p1 = new Person("Jack", "Jack@gmail.com");
        Person p2 = new Person("John", "John@gmail.com");
        Person p3 = new Person("Nick", "NickAnna@gmail.com");
        Person p4 = new Person("Anna", "NickAnna@gmail.com");

        Map<String, Person> map1 = new HashMap<>();
        map1.put(p1.getEmail(), p1);
        map1.put(p2.getEmail(), p2);
        map1.put(p3.getEmail(), p3);
        map1.put(p4.getEmail(), p4);
        map1.put("jack2@gmx.de", p1);

        System.out.println(map1);

        System.out.println(map1.get("John@gmail.com"));
        Set<String>keys=map1.keySet();
        System.out.println(keys);

        Map<Integer,Person> map2=new HashMap<>();
        map2.put(1,p1);
        map2.put(2,p2);
        map2.put(3,p3);
        map2.put(4,p4);
        System.out.println(map2);

        Map<Integer, List<Person>> map3;



    }
}
