package com.company;



public class Person {
    String name;
    int age;
    private final int hashCode;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        hashCode=calcHashCode();
    }


    private int calcHashCode(){
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public String toString() {
        return name+" (" + age+")";
    }
}
