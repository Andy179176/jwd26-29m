package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("qwe1");
        list.add("аqwe2");
        list.add("rt");
        list.add("qwe3");
        list.add("аqwe4");
        list.add("ty");
        list.add("qwe5");


        System.out.println(testList(list));
        System.out.println(getListWithShortName(list));
    }

    public static int testList(List<String> list){
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            String s= list.get(i);
            if(s.startsWith("а")) count++;
        }
        return count;
    }

    /*
    Дан лист с именами. Необходимо получить лист в котором
    присутствуют имена из исходного листа, но только те, что короче 3 символов.
     */

    public static List<String> getListWithShortName(List<String> list){
        List<String> result = new ArrayList<>();
        for (String st:list) {
            if(st.length()<3) result.add(st);
        }
        return result;
    }




}
