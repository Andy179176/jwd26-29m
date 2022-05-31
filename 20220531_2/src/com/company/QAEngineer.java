package com.company;

public class QAEngineer  extends Employee{
    boolean giraSkills;

    public QAEngineer(String name, double salary,boolean giraSkills) {
        super(name,salary);
        this.giraSkills=giraSkills;
    }

    public String toString() {
        return "QAEngineer: " + name + "("+salary +")";
    }

    public void work(){
        System.out.println( name+":I'am QAEngineer. I check the programs." );
    }
}
