package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(max3(19,99,17));
    }


    /*
Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
наибольшее из трех переданных чисел:
Например: max3(10,19,0) -> 19
     */

    public static int max3(int num1, int num2, int num3){
        /*
        if(num1>num2&&num1>num3){
            return num1;
        } else if (num2>num1&&num2>num3){
            return num2;
        } else{
            return num3;
        }
         */
        int max = (num1>num2)?num1:num2;

        return (max>num3)?max:num3;
    }


}
