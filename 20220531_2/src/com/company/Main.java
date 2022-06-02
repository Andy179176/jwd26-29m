package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	 Programmer p1=new Programmer("Jack",5000.0);
	 Programmer p2=new Programmer("Nick",5500.0);
     QAEngineer q1=new QAEngineer("John", 4800,false);
     QAEngineer q2=new QAEngineer("Anna", 5300.0,true);
     //Employee employee = new Employee("emp",1000);

     Programmer p3=new Programmer("Ron");


        List<Employee> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(q1);
        list.add(q2);
        list.add(new Lazy("Emelya",10000));

        for (Employee e:list) {
            e.work();
            e.paySalary();
        }



    }
}
