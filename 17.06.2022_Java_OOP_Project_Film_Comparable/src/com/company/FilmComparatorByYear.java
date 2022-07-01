package com.company;

public class FilmComparatorByYear extends FilmComparator {
    public FilmComparatorByYear(String comparingName) {
        super(comparingName);
    }

    @Override
    public int compare(Film o1, Film o2) {
        return o1.getYear()-o2.getYear();
    }
}
