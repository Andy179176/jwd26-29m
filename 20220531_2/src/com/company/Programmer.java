package com.company;

public class Programmer extends Employee{


    public Programmer(String name, double salary) {
        super(name, salary);
    }

    public String toString() {
        return "Programmer: " + name + "("+salary +")";
    }

    public void work(){
        System.out.println( name+":I'am programmer. I write code." );
    }

    public void setSalary(double salary){
        if(this.salary<salary){
            this.salary=salary;
        }
    }

}
