package com.company;

public class StudentGPA {
    private String name;
    private double gpa;

    public StudentGPA(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + "  " + gpa;
    }
}
