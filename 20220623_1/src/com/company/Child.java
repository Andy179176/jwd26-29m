package com.company;

public class Child extends Parent {
    String fname;

    public Child(String fname, String lname) {
        super(fname, lname);
        this.fname = fname;
    }

    @Override
    public String getFname() {
        return "Child:" +fname;
    }

    public void m(){}
}
