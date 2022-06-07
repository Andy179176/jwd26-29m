package com.company;

public class MyDate implements Comparable<MyDate> {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "-"+ month +"-" +year;
    }

    public int compareTo(MyDate date){
       if (this.year!=date.year) {
           return this.year-date.year;
       };
       if (this.month!=date.month){
           return  this.month-date.month;
       }
       return this.day-date.day;
    }



/*
        int compareTo(MyDate date){
        if(date.year> this.year) {
            return -1;
        } else if (date.year<this.year) {
            return 1;
        } else {
            if(date.month> this.month) {
                return -1;
            } else if (date.month<this.month) {
                return 1;
            }  else {
                if(date.day> this.day) {
                    return -1;
                } else if (date.day<this.day) {
                    return 1;
                } else {
                    return 0;
                }
            }

        }
    }
*/
}
