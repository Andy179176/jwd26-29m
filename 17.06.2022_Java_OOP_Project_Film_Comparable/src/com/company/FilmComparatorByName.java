package com.company;

public class FilmComparatorByName extends FilmComparator {


    public FilmComparatorByName(String comparingName) {
        super(comparingName);
    }

    @Override
    public int compare(Film o1, Film o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
