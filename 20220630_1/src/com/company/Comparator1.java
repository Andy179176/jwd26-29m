package com.company;

import java.util.Comparator;

public class Comparator1 implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().length()-o2.getName().length();
    }
}
