package com.company;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
Дан список Integer, каждое значение число от 1 до 12 (результат броска двух игральных костей).
В результате работы программы, необходимо сформировать отчет, сколько раз выпало каждое ччисло.
Вывести результат в порядке возрастания.
{6,6,1,4,9,12,11,9,1,9} –{1->2, 4->1, 6->2, 9->3, 11->1, 12->1}

 */
public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(6,6,1,4,9,12,11,9,1,9);
        System.out.println(count2(list));
        print(count3(list));

    }

    public static Map<Integer, Integer> count(List<Integer> list){
        Map<Integer,Integer> map = new TreeMap<>();
        if(list==null||list.isEmpty()) return map;
        for (Integer i:list) {
            if(map.containsKey(i)){
                Integer temp= map.get(i);
                temp++;
                map.put(i,temp);
            } else {
                map.put(i,1);
            }
        }
        return map;
    }

    public static Map<Integer, Integer> count2(List<Integer> list){
        Map<Integer,Integer> map = new TreeMap<>();
        if(list==null||list.isEmpty()) return map;
        for (Integer i:list) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map;
    }

    public static int[] count3(List<Integer> list){
        int[] arr = new int[13];
        if(list==null||list.isEmpty()) return arr;

        for (Integer i:list) {
            arr[i]++;
        }
        return arr;
    }
    public static void print(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0) System.out.printf("%d=%d    ",j,arr[j]);
        }
    }


}
