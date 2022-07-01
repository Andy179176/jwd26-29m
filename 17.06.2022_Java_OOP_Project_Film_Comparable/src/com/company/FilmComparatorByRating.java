package com.company;

public class FilmComparatorByRating extends FilmComparator {

    public FilmComparatorByRating(String comparingName) {
        super(comparingName);
    }

    @Override
    public int compare(Film o1, Film o2) {
        if(o1.getRating()>o2.getRating()) return 1;
        if(o1.getRating()<o2.getRating()) return -1;
        return 0;
    }
}
