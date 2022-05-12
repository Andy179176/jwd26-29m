package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------- findFirstCharIndex");
        System.out.println(findFirstCharIndex("let’s talk about java",'0'));
        System.out.println("----------- lengthPrefix");
        System.out.println(lengthPrefix("Hello", "Hel0o"));
        System.out.println(getPrefix("Hello", "Hel0o"));
    }
    /*
Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 2
     */

    public static int findFirstCharIndex(String str, char ch){

        for (int i = 0; i <str.length() ; i++) {
            if(ch==str.charAt(i)){
                return i;
            }
        }
        return -1;

    }

/*
Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
нет, возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 15
 */

    public static int findLastCharIndex(String str, char ch){

        for (int i = str.length()-1; i >=0 ; i--) {
            if(ch==str.charAt(i)){
                return i;
            }
        }
        return -1;

    }

    /*
    Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
символов начиная с начала одинаковые у обеих строк.
     */

    public static int lengthPrefix(String str1, String str2){
        int i=0;

        while (i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return i;
    }

    /*
       Реализовать метод, который возвращает общий префикс двух строк, т.е. строку
   символов начиная с начала, одинаковую у обеих строк.
        */
    public static String getPrefix(String str1, String str2){
        int i=0;
        String result="";
        while (i<str1.length() && i<str2.length() && str1.charAt(i)==str2.charAt(i)){
            result+=str1.charAt(i); // result=result+str1.charAt(i);
            i++;
        }
        return result;
    }


    /*
Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
символов начиная с конца одинаковые у обеих строк.
     */

    public static int lengthPostfix(String str1, String str2){
        int i1=str1.length()-1;
        int i2=str2.length()-1;
        int count=0;

        while (i1>=0 && i2>=0 && str1.charAt(i1)==str2.charAt(i2)){
            i1--;
            i2--;
            count++;
        }
        return count;
    }


}
