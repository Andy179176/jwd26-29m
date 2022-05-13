package com.company;

public class Main {

    public static void main(String[] args) {
	int[] a={6,7,33,3,6,3,8,-8,2,-10,0,2};
	printArray(a);
	System.out.println("Min: "+minValue(a));
	System.out.println("Min index: "+minElementIndex(a));
        System.out.println("------------ sum ---------------");
	int[] b={6,-7,33};
	printArray(b);
        System.out.println("Sum: "+sumOfArray(b));
        System.out.println("------------------ even ---------");
        int[] c =evenNumbers(10,32);
        printArray(c);
        System.out.println("------------------------------");
        char f[]=new char[]{'q','w','t','u'};
        printSameElements(f,new char[]{'q','w','y','u'});

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print("["+i+"]:"+array[i]+"   ");
        }
        System.out.println();
    }


    /*
 Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение
в данном массиве.
Например: {1,3,6,-1,4,-5,9} -> -5
     */
     public static int minValue(int[] array){
         int min = array[0];
         for (int i = 1; i <array.length ; i++) {
             min=(min>array[i])? array[i]:min;
             /*
             if (min>array[i]){
                 min=array[i];
             }
              */
         }
         return min;
     }

    public static int minValue2(int[] array){
        int min = array[0];
        for (int i = 1; i <array.length ; min=(min>array[i])? array[i]:min,i++);
        return min;
    }

    /*
 Дан массив целых чисел. Реализовать метод, который возвращает индекс минимальнго
значение в данном массиве.
Например: {1,3,6,-1,4,-3,1} -> 5
     */
    public static int minElementIndex(int[] array){
        int index= 0;
        for (int i = 1; i <array.length ; i++) {
             if (array[index]>array[i]){
                 index=i;
             }
             //index=(array[index]>array[i])?i:index;
        }
        return index;
    }

    /*
 Дан массив целых чисел. Реализовать метод, который возвращает сумму всех
положительных элементов данного массива
Например: {1,3,6,-1,4,-3,1} -> 15
     */
 public static long sumOfArray(int[] array){
     long sum=0;
     for (int i = 0; i <array.length ; i++) {
         if (array[i]>0){
             sum+=array[i];
         }
     }
     return sum;
 }

/*
Реализовать метод, который возвращает массив из первых n четных чисел, начиная с
заданного числа start
Например, для заданных n=4, start=21: {22,24,26,28,4}
 */

    public static int[] evenNumbers(int n, int start) {

        if (n <= 0) {
            return new int[0];
        }
        int[] result = new int[n];
        if (start % 2 != 0) {
            start++;
        }

        for (int i = 0; i <result.length; i++) {
            result[i]=start;
            start+=2;
        }

        return result;
    }

    /*
Дано два массива char одинаковой длинны. Написать метод, который выводит все символы,
которые совпадают и имеют одинаковые индексы и в первом и во втором массиве.
Например: {‘a’,’b’,’c’,’d’}, {‘d’,’b’,’c’,’f’} ->bc
     */

    public static void printSameElements(char[] arr1, char[]arr2){
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]==arr2[i]){
                System.out.print(arr1[i]);
            }
        }

    }

}
