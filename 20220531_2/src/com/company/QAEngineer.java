package com.company;

public class QAEngineer  extends Employee{
    boolean giraSkills;

    public QAEngineer(String name, double salary,boolean giraSkills) {
        super(name,salary);
        this.giraSkills=giraSkills;
    }

    public String toString() {
        return "QAEngineer: " + getName() + "("+getSalary() +")";
    }


    public void work(){
        System.out.println( getName()+":I'am QAEngineer. I check the programs." );
    }
}
