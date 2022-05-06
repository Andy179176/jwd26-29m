package com.company;

public class Main {
/*
Реализовать метод, который принимает две строки и возвращает строку, содержащую символы
из первой строки, смешанные через одну с символами из другой строки
    “abcd”, “qwer” -> “aqbwcedr”
     “ab”, “qwer” -> “aqbwer”
    “abcd”, “qw” -> “aqbwcd”


    "hello java world"
    "I will be a developer"

  hI

 */




    public static void main(String[] args) {
        System.out.println(mixLetters3("135", "246"));
        System.out.println(mixLetters3("abcd", "gh"));
        System.out.println(mixLetters3("abcd", "ghhjkyui"));


    }
    public static String mixLetters(String str1, String str2){
        String result="";

        int i=0;
        while(i<str1.length()||i<str2.length()){
            if(i<str1.length()){
                result=result+str1.charAt(i);
            }
            if(i<str2.length()){
                result=result+str2.charAt(i);
            }
            i++;
        }

        return result;
    }
    public static String mixLetters2(String str1, String str2){
        String result="";
        for(int i=0;i<str1.length()||i<str2.length();i++){
            result=(i<str1.length())?result+str1.charAt(i):result;
            result=(i<str2.length())?result+str2.charAt(i):result;
        }
        return result;
    }

    public static String mixLetters3(String str1, String str2){
        String result="";

        int i=0;
        while (i < str1.length() && i < str2.length()) {
            result = result + str1.charAt(i) + str2.charAt(i);
            i++;
        }
        for (int j = i; j < str1.length() ; j++) {
            result = result + str1.charAt(j);
        }
        for (int j = i; j < str2.length() ; j++) {
            result = result + str2.charAt(j);
        }

        return result;
    }

}
