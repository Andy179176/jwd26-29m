package com.company;
/*
   1. try .... catch ......
   2. throws   main  m1 -> m2 -> m3 Exception

 */
public class Main2 {

    public static void main(String[] args) {
        // write your code here
        m1();
    }

    public static void m1(){
        String s="null";
        m2(s);
    }

    public static void m2(String s){
        try {
            m3(s);
        } catch (NullPointerException e){
            System.out.println("Метод m3 не может быть выполнен, если нет данных");
        }

    }

    public static void m3(String s){
            System.out.println(s.length());
    }



}