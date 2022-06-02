package com.company;

public class Programmer extends Employee{


    public Programmer(String name, double salary) {
        super(name, salary);

    }

    public Programmer(String name) {
        //super(name,3000);
        this(name,3000.0);

    }

    public String toString() {
        return "Programmer: " + getName() + "("+getSalary() +")";
    }

    @Override
    public void work(){
        System.out.println( getName()+":I'am programmer. I write code." );
    }

    @Override
    public void paySalary(){
        System.out.println(getName()+":I got my salary " + getSalary() +" euro + " + 1000 + " bonus for clean code");
    }

/*
    public void setSalary(double salary){
        if(this.salary<salary){
            this.salary=salary;
        }
    }
*/


}
