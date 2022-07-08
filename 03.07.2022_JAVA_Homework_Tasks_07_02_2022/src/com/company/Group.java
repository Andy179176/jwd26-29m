package com.company;

import java.util.List;

public class Group {
    private String title;
    private List<Student>studentsList;

    public Group(String title, List<Student> studentsList) {
        this.title = title;
        this.studentsList = studentsList;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    @Override
    public String toString() {
        return System.lineSeparator()+ "Group: " + "title: " + title + ", studentsList: " + studentsList+System.lineSeparator();
    }
}
