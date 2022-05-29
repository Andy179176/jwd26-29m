package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1=new Person("Jack",20);
        Person p2=new Person("Nick",22);
        Person p3=new Person("Qwe1",22);
        Person p4=new Person("Qwe2",23);



        Person[] people = {p1,p2};
        PersonArray personArray=new PersonArray(people);
        System.out.println(personArray);

        personArray.add(p3);
        System.out.println(personArray);

        personArray.add(p4);
        System.out.println(personArray);

    }
}
