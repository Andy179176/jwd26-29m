package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        MyDate date1=new MyDate();
        date1.day = 10;
        date1.month=5;
        date1.year=2022;
        */

        MyDate date1=createMyDate(10,5,2022);
        printDate(date1);
        MyDate newDate=addDay(date1);
        printDate(newDate);

    }

    public static void printDate(MyDate date){
        System.out.println(date.day+"/"+date.month+"/"+date.year);
    }

    public static int addOne(int a){
        int b=a+1;
        return b;
    }

    public static MyDate createMyDate(int day, int month, int year ){
        MyDate result=new MyDate();
        result.day = day;
        result.month= month;
        result.year=year;
        return result;
    }

    public static MyDate addDay(MyDate date){
        MyDate result=new MyDate();
        result.day = date.day+1;
        result.month= date.month;
        result.year=date.year;
        return result;
    }


}
