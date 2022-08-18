package com.company;
/*
Реализовать обобщенный метод поиска максимального элемента в любом допустимом листе.
 */

import java.util.List;

public class Main11 {

    public static void main(String[] args) {

        System.out.println(max(List.of("ab", "abc", "cd", "aa")));
        System.out.println(max(List.of(1, 2, 5, 0)));

    }
    
    
    public static <T extends Comparable<T>>  T max (List<T> list){
        T max=null;

        for (T s:list ) {
            if((max==null)||(s.compareTo(max)>0)){
                max=s;
            }
        }
        return max;
    }


    
}

class MyClass<T extends Number >  implements Comparable<T>{
    T qwaqwa;

    @Override
    public int compareTo(T o) {
        return 0;
    }
}

