package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------- printNumsDivisible4 -----------");
	    printNumsDivisible4();
        System.out.println("-------------------- sum -----------");
        System.out.println(sum(2147483640,2147483641));

        System.out.println("-------------------- sum with digit -----------");
        System.out.println(sum(10,15,3));

    }

    /*
Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
делятся на 4
     */

    public static void printNumsDivisible4(){
        for (int i = 0; i<100 ; i++) {
            if(i%4!=0){
                System.out.println(i);
            }
        }
    }

    /*
Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
всех чисел от start до finish включительно.
Например: sum(10,15) -> 75
     */
   public static long sum(int start, int finish){
       long sum=0;
       for (long i = start; i <= finish ; i++) {
           sum+=i;
       }
       return sum;
   }

   /*
   *Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
находится в диапазоне (0<=digit<=9), если нет, то считаем digit=0. Метод должен вернуть
сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
Число 13 не входит. )
    */

   public static long sum(int start, int finish, int digit){
       long sum=0;
       digit=(digit>=0&&digit<=9)?digit:0;
       for (long i = start; i <= finish ; i++) {
           if(i%10!=digit) sum+=i;
       }
       return sum;
   }

}
