package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FilmCompareSortCases {
        private List<FilmComparator> comparators;
        private Comparator<Film> filmChoise = null;

        public FilmCompareSortCases(List<FilmComparator> comparators) {
        this.comparators = comparators;
        }



    public Comparator<Film> getFilmComparator(){
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Which other films sorting you want to use :");
            int num=1;
            for (FilmComparator fc: comparators) {
                System.out.println(num + ": " +fc.getComparingName());
                num++;
            }
            int sortChoise= sc.nextInt();
            if(sortChoise>0&&sortChoise<=comparators.size()){
                filmChoise= comparators.get(sortChoise-1);
            } else {
                System.out.println("Please take another taste ");
            }
        } while (filmChoise==null);

        return filmChoise;
    }
}
