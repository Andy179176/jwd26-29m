package com.company;

public class Child extends Person {
    public Child(String name, MyDate birthday) {
        super(name, birthday);
    }

    public void jump(){
        System.out.println(getName() + "I am a child, I can't is jumping");
    }

    public void cry(){
        System.out.println(getName() + "I am crying");
    }

}
