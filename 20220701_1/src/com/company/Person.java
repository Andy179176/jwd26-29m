package com.company;

public class Person {
    private String name;
    private int yearOfBirhday;
    private MyDate birthday;


    public Person(String name, int yearOfBirhday) {
        this.name = name;
        this.yearOfBirhday = yearOfBirhday;
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        if (yearOfBirhday!=0) return 2022-yearOfBirhday;
        return 2022-birthday.getYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirhday=" + yearOfBirhday +
                '}';
    }

    public void jump(){
        System.out.println(name + " is jumping");
    }

    public void jump(int num){
        for (int i=1;i<=num;i++) {
            System.out.println(name + " is jumping " + i);
        }
    }
}
