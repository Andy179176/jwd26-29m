package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class MyPersonArray2  implements Iterable<Person>, Iterator<Person> {
    private Person[] person;
    private int index=0;

    @Override
    public boolean hasNext() {
        return index<person.length;
    }

    @Override
    public Person next() {
        return person[index++];
    }

    public MyPersonArray2(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "person=" + Arrays.toString(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return this;
    }

}
