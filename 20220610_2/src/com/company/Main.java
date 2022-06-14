package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
Create an array of Person (firstName, lastName, age).
 Sort the by Person’s age using the Arrays.sort() method.


 */
public class Main {

    public static void main(String[] args) {
        Person[] people = {
                new Person("first1","second1",20),
                new Person("first2","second2",5),
                new Person("first3","second3",10),
                new Person("first4","second4",99),
                new Person("first5","second5",62),
        };

        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));


        List<Person> list = new ArrayList<>();
        for (Person p:people ) {
            list.add(p);
        }

        Object[] objects =list.toArray();
        for (Object obj:objects) {
            System.out.println( ((Person)obj).getFirstName() );
        }
/*
        Person[] personsArr =(Person[]) list.toArray();
        for (Person pr:personsArr ) {
            System.out.println(pr.getFirstName());
        }
 */
        Person[] people1 = new Person[list.size()];
        people1=list.toArray(people1);
        for (Person pr:people1 ) {
            System.out.println(pr);
        }



    }



}
