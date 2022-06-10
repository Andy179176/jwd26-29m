package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(null);

        System.out.println(list);
        System.out.println(getNewReversedList(list));
        System.out.println("---------------------");
        System.out.println(list);
        revers(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }

    public static List<Integer> getNewReversedList(List<Integer> list){
        List<Integer> res=new ArrayList<>(list.size());  // size of result list
        for (int i = list.size()-1; i>=0 ; i--) {
           res.add(list.get(i));
        }
        return res;
    }

    public static void revers(List<Integer> list){
        int right=list.size()-1;
        int left = 0;
        while (left<right){
            /*
            Integer temp = list.get(right); // swap(right,left)
            list.set(right,list.get(left));
            list.set(left,temp);
            left++;
            right--;
            */
            Collections.swap(list,right--,left++);


        }





    }
}
