package com.company;

public class Child1 extends Parent{

    private String property;


    public Child1(String property) {
        super("parent property");
        this.property=property;
    }

    public String doSomeThing2(){
        return "doSomeThing2: Child1 " +getProperty();
    }

    public  void  methodChild1(){

    }

}
