package com.company;

public class FilmComparatorByNameDesc extends FilmComparator {


    public FilmComparatorByNameDesc(String comparingName) {
        super(comparingName);
    }

    @Override
    public int compare(Film o1, Film o2) {
        return o2.getName().compareTo(o1.getName());
    }


}
