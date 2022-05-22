package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        MyDate date1=new MyDate();
        date1.day = 10;
        date1.month=5;
        date1.year=2022;
        */

        MyDate date1=new MyDate(10,5,1998);
        MyDate date5=new MyDate(10,5,2022);
        MyDate date2=new MyDate(13,5,2005);
        MyDate date3=new MyDate(15,6,2010);
        MyDate date4=new MyDate(16,5,2022);
        MyDate date6=new MyDate(20,5);


        MyDate[] dateArray={date1,date2,date3,date6};
        for (int i = 0; i < dateArray.length; i++) {
           dateArray[i].print();
        }

        Person p1=new Person("Nick", date1);
        Person p2=new Person("Jack", date2);
        Person p3=new Person("Anna", date3);


        Person[] people= {p1,p2,p3};
        for (int i = 0; i <people.length ; i++) {
            System.out.println(people[i]);
        }

        date1.print();


    }

}
