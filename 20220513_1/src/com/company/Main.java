package com.company;

public class Main {

    public static void main(String[] args) {
        /* Substring */

        String str= "123456789";
        System.out.println(str.substring(3,6));
        String str1= str.substring(0,6);
        String str2= str.substring(6);








        printCharsInBrackets("hello");
        System.out.println(securedIBAN("DE5128279087265"));
    }
/*
Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
в [] Например: “Hello” -> [H][e][l][l][o]
 */

    public static void printCharsInBrackets(String str){
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(addBrackets(str.charAt(i)));
        }
        System.out.println();
    }
    public  static String addBrackets(char ch){
        return "["+ch+"]";
    }

/*
Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
который вместо заданной строки с номером счета (например ”DE5128279087265”)
возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
засекреченных цифр)
 */

    public static String securedIBAN(String iban){
        String result="";
        for (int i = 0; i < iban.length(); i++) {
            result+= (i<4 || i>iban.length()-3)? iban.charAt(i):'*';

            /*
            if(i<4 || i>iban.length()-3) {
                result+=iban.charAt(i);
            } else {
                result+='*';
            }
             */
        }
        return result;
    }




}
