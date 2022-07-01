package com.company;

public class FilmComparatorByGenre extends FilmComparator {


    public FilmComparatorByGenre(String comparingName) {
        super(comparingName);
    }

    @Override
    public int compare(Film o1, Film o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
