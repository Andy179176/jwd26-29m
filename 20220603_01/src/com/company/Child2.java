package com.company;

public class Child2 extends Parent {

    public Child2(String property) {
        super(property);
    }

    public String doSomeThing2(){
        return "doSomeThing2: Child2 " + getProperty();
    }

}
