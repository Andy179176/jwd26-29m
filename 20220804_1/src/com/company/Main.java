package com.company;

import java.util.*;

public class Main {
    /*
    Дан отсортированный лист Integer. Необходимо удалить из него все дубликаты.
{6,6,8,9,14,15,15,15,20} -> {6,8,9,14,15,20}

     */

    public static void main(String[] args) {
        System.out.println("hhh" +21*3);
        List<Integer> list = new ArrayList<>(List.of(6,8,9,14,15,15,15,20));
        System.out.println(removeDuplicates4(list));

    }

    public static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new TreeSet<>(list));
    }

    public static List<Integer> removeDuplicates2(List<Integer> list){
        if(list!=null&&list.size()>1){
            Iterator<Integer> iterator = list.iterator();
            Integer prev = iterator.next();
            while (iterator.hasNext()){
                Integer current=iterator.next();
                                    if(current.equals(prev)){
                                        iterator.remove();
                                    } else {
                                        prev=current;
                                    }
            }

        }
        return list;
    }

    public static List<Integer> removeDuplicates3(List<Integer> list){
        if(list!=null&&list.size()>1){
            ListIterator<Integer> iterator = list.listIterator(1);
            Integer prev = list.get(0);
            while (iterator.hasNext()){
                Integer current=iterator.next();
                if(current.equals(prev)){
                    iterator.remove();
                } else {
                    prev=current;
                }
            }

        }
        return list;
    }

    public static List<Integer> removeDuplicates4(List<Integer> list){
        LinkedList<Integer> res = new LinkedList<>();
        if(list==null||list.size()<2) return list;
        res.add(list.get(0));
        for (Integer i:list) {
            if(!i.equals(res.getLast())){
                res.add(i);
            }
        }

        return res;
    }


}
