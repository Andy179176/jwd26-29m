package com.company;

public class Parent {
    private String property;

    public Parent(String property) {
        this.property = property;
    }

    public String doSomeThing1(){
        return "doSomeThing1: Parent " +property;
    }


    public String doSomeThing2(){
        return "doSomeThing2: Parent " +property;
    }

    public String getProperty() {
        return property;
    }
}
