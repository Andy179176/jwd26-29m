package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyPersonArray persons= new MyPersonArray(
                new Person[] {
                        new Person("person1"),
                        new Person("person2"),
                        new Person("person3"),
                        new Person("person4"),
                }
        );
        System.out.println(persons);

/*
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

 */
        for (Person p: persons ) {
            System.out.println(p);
        }


        MyPersonArray2 persons1= new MyPersonArray2(
                new Person[] {
                        new Person("1person1"),
                        new Person("1person2"),
                        new Person("1person3"),
                        new Person("1person4"),
                }
        );

        for (Person p: persons1 ) {
            System.out.println(p);
        }

	// write your code here
    }
}
