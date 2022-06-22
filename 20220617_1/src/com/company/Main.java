package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();

        Student st1 = new Student("Jack", Arrays.asList(4,2,4,5,3,5,2,3));
        Student st2 = new Student("John", Arrays.asList(4,2,5,2,3));
        Student st3 = new Student("Anna", Arrays.asList(5,5,5,4,5,4,5));

        List<Student> students= new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        System.out.println(transform(students));

    }

    public static List<StudentGPA> transform(List<Student> students){
        List<StudentGPA> result=new ArrayList<>();
        if(students==null||students.isEmpty()) return result;

        for (Student s: students) {
            result.add(new StudentGPA(s.getName(),s.getGPA()));
        }

        return result;
    }
}
