package com.company;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year ){
        this.month= month;
        this.day = day;
        this.year=year;
    }

    public MyDate(int day, int month ){
        this.month= month;
        this.day = day;
        this.year=2022;
    }

    public MyDate(){
        this.month= 1;
        this.day = 1;
        this.year=2022;
    }


/* Создать класс автомобиль, у которого должны быть следующие поля - модель, год выпуска, цвет.
Создать метод печати, также создать в методе main несколько обьектов класса, положить их в массив и распечатать */


    public void print(){
        System.out.println(year+"-"+month+"-"+this.day);

    }

    public void print(char delimiter){
        System.out.println(0+delimiter);
    }

    public String toString(){
        String str=year+"-"+month+"-"+day;
        return str;
    }


}
