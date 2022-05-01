package com.company;

public class Main {

    // "Привет Andy!"


    public static void main(String[] args) {
	    String str="hello";
	    String str2="Привет Andy!";
        System.out.println(str.length());

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        String result="";
        for (int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='l'){
               result=result+ch;
            }
        }
        System.out.println(result);
        System.out.println(str2.substring(7,11));
        System.out.println(substring(str2,-7,11));

    }

    public static String substring(String str,int start, int finish){

        String result="";
        for (int i = start; i < finish; i++) {
           char ch=str.charAt(i);
           result=result+ch;
        }

        return result;
    }



    /*



            star finish
    "java is very easy!"
   0) создать новую строку result
   1) перебираем символы от позиции старт(включительно) до позиции финиш(не вкл.)
        - делаем цыкл где меняем "индекс" от старт до финиш с шагом 1
        - на каждом шаге берем символ с номером "индекс" chatAt(индекс)
   2) каждый символ кладем в новую строку
        result= все что накоплено в строке + символ







     */


}
