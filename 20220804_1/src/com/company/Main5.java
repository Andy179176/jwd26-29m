package com.company;
/*
6.	Дана  map <Character, Integer>. Необходимо сформировать случайную строку, где соответствующая
буква будет встречаться заданное количество  раз.
{A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”

 */


import java.util.*;

public class Main5 {
    public static void main(String[] args) {

        Map<Character, Integer> map =new HashMap<>();
        map.put('a',3);
        map.put('d',1);
        map.put('j',5);
        map.put('f',2);
        map.put(' ',2);

        System.out.println(randomString(map));
    }

    public static  String randomString(Map<Character,Integer> map){
        List<Character> list = new ArrayList<>();
        for(Character ch:map.keySet()){
            for (int i = map.get(ch); i>0; i--){
                list.add(ch);
            }
        }
        Collections.shuffle(list);
        StringBuffer res= new StringBuffer();
        for (Character ch:list){
            res.append(ch);
        }
        return res.toString();
    }

}
