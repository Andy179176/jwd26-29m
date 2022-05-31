package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1a");
        list.add("2b");
        list.add("3c");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------------------");

        for (String s : list ) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");
        int[] arr= {1,2,3,4};
        long sum=0;
        for (int i:arr) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println(sum);



    }
}
