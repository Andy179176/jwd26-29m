package com.company;

import java.util.ArrayList;
import java.util.List;

/*
Пусть дан список List объектов типа User{String fName, String lName, int age }.
Предположим, при чтение User-ов из базы данных случилась ошибка и у всех пользователей
из списка поменялись местами fName и lName. Необходимо написать метод,
который исправит   данную ситуацию.
 */
public class Main {

    public static void main(String[] args) {
	   //"wert" "fdhjkld;" "uss"   -> "wert" "fdhj" "uss"
        List<String> strings= new ArrayList<>();
        strings.add("wert");
        strings.add("fdhjkld;");
        strings.add("uss");
        System.out.println(strings);
        transformLongStrings(strings);
        System.out.println(strings);

    }

    public static void transformLongStrings(List<String> strings){
        for (int i=0; i<strings.size();i++ ) {
            String s= strings.get(i);
            if(s.length()>4) {
                strings.set(i, s.substring(0, 4));
            }
        }
    }

        public static void transformLongStrings1(List<String> strings){
            int i=0;
            for (String s: strings ) {
                if(s.length()>4) {
                    strings.set(i, s.substring(0, 4));
                }
              i++;
            }
        

    }
}
