package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
   1. try .... catch ......
   2. throws   main  m1 -> m2 -> m3 Exception

 */

/*
try .....  catch
throw   .....    throws

 */

public class Main5 {

    public static void main(String[] args) {
        // write your code here

        try {
            useEmailMethod(null);
            System.out.println("Email is correct");
        } catch (EmailNotCorrectException e) {
            System.out.println("Email not correct");
            e.printStackTrace();
        }

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

    //FileNotFoundException   -> IOException -> Exception            // Checked
    // NullPointerException   -> RuntimeException -> Exception      // Unchecked

    public static int m3(String s) throws FileNotFoundException  {
        int res=0;
        s.length();

        FileReader fileReader = new FileReader("D:/xcvbn1.txt");


        /* читаем файл*/
        res=10;
        return res;
    }


    public static void useEmailMethod(String email) throws EmailNotCorrectException{
        if(email==null){
            throw new EmailNotCorrectException();
        }
    }



}