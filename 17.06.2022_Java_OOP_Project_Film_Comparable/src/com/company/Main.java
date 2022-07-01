package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Film film1= new Film("Titanik","drama",1999,4);
        Film film2= new Film("Lord of the rings","Fantasy",2003,7);
        Film film3= new Film("Terminator","Actionfilm",1989,5);
        Film film4= new Film("Friends","Comedy",2005,4);
        Film film5= new Film("Harold and Humar","Comedy",2007,3);
        Film film6= new Film("The rock","Actionfilm",1987,6);

        List<Film>filmArrayList= new ArrayList<>();
        filmArrayList.add(film1);
        filmArrayList.add(film2);
        filmArrayList.add(film3);
        filmArrayList.add(film4);
        filmArrayList.add(film5);
        filmArrayList.add(film6);

        List<FilmComparator> comparators = new ArrayList<>();
            comparators.add(new FilmComparatorByGenre("By genre"));
            comparators.add(new FilmComparatorByName("By name"));
            comparators.add(new FilmComparatorByRating("By rating"));
            comparators.add(new FilmComparatorByYear("By year"));
            comparators.add(new FilmComparatorByYear("By name (desc)"));




        FilmCompareSortCases  newSortFilms = new FilmCompareSortCases (comparators);
        Comparator<Film> comparator= newSortFilms.getFilmComparator();

        Collections.sort(filmArrayList, comparator);
        System.out.println(filmArrayList);



    }




}
