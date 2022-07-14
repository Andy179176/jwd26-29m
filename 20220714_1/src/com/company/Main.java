package com.company;
/*
   1. try .... catch ......
   2. throws   main  m1 -> m2 -> m3 Exception

 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        m1();
    }

    public static void m1(){
        String s="null";
        m2(s);
    }

    public static void m2(String s){
        m3(s);
    }
    public static void m3(String s){
        String res="Задача выполнена";
        try {
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("Строки нет");
            res="Задача не может быть выполнена";
        }
        System.out.println(res);

    }



}