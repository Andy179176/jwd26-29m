package com.company;

public class User implements Comparable<User>{
    private String name;
    private int age;
    private String email;


    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + '(' + age +"), email='" + email;
    }

    @Override
    public int compareTo(User o) {
        return email.compareTo(o.email);

    }
}
