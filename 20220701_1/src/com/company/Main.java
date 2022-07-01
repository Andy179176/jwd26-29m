package com.company;

public class Main {

    public static void main(String[] args) {
	  Person p1= new Person("Jack",1988);
	  Person p2= new Person("John",2000);
	  Person p3= new Person("Nick",2010);

        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
        p3.jump();
        p2.jump(2);
        Child child = new Child("Bob",new MyDate(10,10,2021));

        Person p4= new Person("Nick",new MyDate(10,10,2010));
        child.jump();


        //System.out.println("p1 age= "+ (2022-p4.yearOfBirhday));





    }
}
