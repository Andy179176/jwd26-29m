package com.company;

public class Main {

    public static void main(String[] args) {
	   int num=15;
	   int num2=10;
	   int num3=3;
	   printCheckResultMessage(num, isEven(num));

	   printCheckResultMessage(num, num2, isDivisible(num,num2));

	   printCheckResultMessage(num, num2,num3, isDivisible(num,num2,num3));

    }
/*
Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
“15 это не четное число»
Подсказка: Используем конструкцию if и оператор % modulo
 */

 public static boolean isEven(int number){
    /*
     if(number%2==0){
         return true;
     } else {
         return false;
     }
     */
     return number%2==0;
 }

 public static void printCheckResultMessage(int number, boolean result){
    /*
     if(result){
         System.out.println(number + " это четное число");
     } else {
         System.out.println(number + " это не четное число");
     }
     */
     System.out.println((result)? number + " это четное число" : number + " это не четное число");
    }


    /*
Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
true если number1 делится на number2 без остатка. Аналогично первой задаче
реализовать метод печати результата.
     */

    public static boolean isDivisible(int number1, int number2){
        return (number2!=0) && (number1%number2==0);
    }

    public static void printCheckResultMessage(int number1,int number2, boolean result){
        System.out.println((result)? number1 + " делится на " + number2 : number1 + " не делится на " + number2);
    }


    /*
Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
должен возвращать true если и первое и второе число делятся без остатка на третье.
Подсказка: Используйте метод, написанный в пункте 2
     */

    public static boolean isDivisible(int number1, int number2, int number3){
        return isDivisible(number1,number3) && isDivisible(number2,number3);
    }

    public static void printCheckResultMessage(int number1,int number2, int number3, boolean result){
        String str= number1+" и "+number2;
        System.out.println((result)? str + " делятся на " + number3 : "что то не делится");
    }

}



