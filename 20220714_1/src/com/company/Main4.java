package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
   1. try .... catch ......
   2. throws   main  m1 -> m2 -> m3 Exception

 */
public class Main4 {

    public static void main(String[] args) {
        // write your code here
        m1();
    }

    public static void m1(){
        String s=null;
        m2(s);
    }

    public static void m2(String s){

        try {
            System.out.println(m3(s));
        } catch (FileNotFoundException | NullPointerException e){
            System.out.println("Проблема ..... или файла нет или null ");
          
        }


    }

    public static int m3(String s) throws FileNotFoundException {
        int res=0;
        //s.length();
        FileReader fileReader = new FileReader("D:/xcvbn1.txt");
        /* читаем файл*/
        res=10;
        return res;
    }



}