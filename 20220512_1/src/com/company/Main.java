package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(max3(19,78,5)); //78
        System.out.println(longestString("0012","iwyq","543")); //
    }


    /*
    Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
    наибольшее из трех переданных чисел:
    Например: max3(10,19,0) -> 19
     */
    public static int max3(int num1, int num2, int num3){
        int max= (num1>num2)? num1 : num2;
        return (max>num3)? max : num3;

    }

    /*
    Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк:
Подсказка: Используйте метод, написанный в пункте 4
Например: longestString (“java”,”welcome”,”hello”) -> “welcome”
     */
public static String longestString (String str1, String str2, String str3){
    String max=(str1.length()>str2.length())? str1:str2;
    return (max.length()>str3.length())? max:str3;
}

}
