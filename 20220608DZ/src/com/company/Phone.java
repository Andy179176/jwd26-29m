package com.company;

public class Phone extends Electronics {
    public Phone(String name, double price) {
        super(name, price);
    }
    @Override
    public String buy() {
        return super.buy() + " and contract " + extraContract();

    }

    private String extraContract(){
        return "MobileTeleCom Contract";
    }
}
