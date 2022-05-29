package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list= new ArrayList<>(1000000);
        List<Person> persons = new ArrayList<>();
        List<Integer> listOfInt=new ArrayList<>();

        Integer integer=10;
        Float f=19.3f;
        Character ch='f';
        Boolean bool= true;
        String stringK="10";
        Integer integerK= Integer.valueOf(stringK);

        int k = 10;
        integerK= Integer.valueOf(k);
        //Byte
        //Double


        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.remove(0);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("["+i+"]: " + list.get(i));
        }

        list.set(0,"hello");

        listOfInt.add(1);
        listOfInt.add(2);
        listOfInt.add(Integer.valueOf("10"));
        System.out.println(listOfInt);




        System.out.println(list);


        Person p1 = new Person("P1",10);
        Person p2 = new Person("P2",10);
        Person p3 = new Person("P1",10);
        if(p1.equals(p2)) {
            System.out.println(p1 + " equals " + p2);
        } else {
            System.out.println(p1 + " not equals " + p2);
        }

        String st1="hello";
        String st2="hello";
        String st3= new String("hello");

        System.out.println("--------------------------");
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1.equals(st3));


    }


}
