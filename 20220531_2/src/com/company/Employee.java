package com.company;

public abstract class Employee {
    private String name;
    private double salary;



    public abstract void work();



    public void paySalary(){
        System.out.println(name+":I got my salary " + salary +" euro");
    }


    public double getSalary()
    {
        return  salary;

    }
    public  String getName() {
        return name;
    }


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
