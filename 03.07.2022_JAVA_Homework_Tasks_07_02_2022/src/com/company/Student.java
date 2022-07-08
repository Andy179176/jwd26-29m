package com.company;

public class Student implements Comparable <Student> {
    private String name;
    private int taskDone;

    public Student(String name, int taskDone) {
        this.name = name;
        this.taskDone = taskDone;
    }

    public String getName() {
        return name;
    }

    public int getTaskDone() {
        return taskDone;
    }

    @Override
    public String toString() {
        return System.lineSeparator()+"Student: " + "name: "+ name + ", taskDone: " + taskDone;
    }

    @Override
    public int compareTo(Student o) {

        if (o.taskDone==this.taskDone)  return o.getName().compareTo(this.name);
        return o.getTaskDone()-this.taskDone;
    }
}
