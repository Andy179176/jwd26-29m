package com.company;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int d, int m, int y ){
        month= m;
        day = d;
        year=y;
    }


    public void print(){
        System.out.println(year+"-"+month+"-"+day);

    }

    public String toString(){
        String str=year+"-"+month+"-"+day;
        return str;
    }


}
