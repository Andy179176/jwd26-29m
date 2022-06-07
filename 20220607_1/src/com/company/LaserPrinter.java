package com.company;

public class LaserPrinter implements Printer {
    String name;

    @Override
    public void print(String s) {
        System.out.println("My printer " + name + " is starting to print: ");
        System.out.println(s);
    }

    public LaserPrinter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                '}';
    }
}
