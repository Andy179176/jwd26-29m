package com.company;

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
        MyDate date2=new MyDate(13,5,2022);
        MyDate date3=new MyDate(15,6,2022);
        MyDate date4=new MyDate(16,5,2022);

        MyDate[] dateArray={date1,date2,date3};
        for (int i = 0; i < dateArray.length; i++) {
           dateArray[i].print();
        }

        Person p1=new Person("Nick", date1);
        p1.print();
        System.out.println("------------------------------");
        p1.print();
        date1.print();


        //date1.printDate();
        //date2.printDate();
        //MyDate newDate=addDay(date1);
        //printDate(newDate);

    }

}
