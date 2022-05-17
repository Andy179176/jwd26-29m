package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      int[] arr={2,8,9,1,1,0,2,1,3,6,3};
      long l =array2long(arr);

        System.out.println(array2long(arr));
        System.out.println(array2long2(arr));


        System.out.println("----------------------");
        System.out.println(l);
        System.out.println((int)l);
        System.out.println((double)l);

        System.out.println("-------------------");

        System.out.println(Arrays.toString(long2array(122339456)));

    }

/*
Дано два массива int. Написать метод, который считает, сколько значений из первого
массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3
 */
    /*
    {1,1,3,5,8}
    {1,2,2,3,5,19,21}
*/
    public static int countSameNumbers(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array2.length && !flag; j++) {
                flag = array1[i] == array2[j];
            }
            if(flag)counter++;
        }
        return counter;
    }

/*
    Допустим, дан массив int, каждое значение в котором лежит в диапазоне от 0 до 9.
    Реализовать метод, который вернет число long, которое поразрядно состоит из элементов
    заданного массива
    Например: {1,3,7,4} -> 1374

    1 3 7 4 =      1*10^3+ 3*10^2+ 7*10^1 + 4*10^0 =   1000  +300  +70 +4 = 1374
      1 3 2 =            1*10^2 + 3*10^1 +  2*10^0

*/


    public static long array2long(int[] arr){
        long pow=1;
        long sum=0;
        int p=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            sum=sum+arr[i]*pow;
            pow=pow*10;
        }
    return sum;
    }

    // using Math.pow
    public static long array2long2(int[] arr){
        long sum=0;
        long p=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            sum=sum+arr[i]*(long)Math.pow(10,p);
            p++;

        }
        return sum;
    }

    /*
    *Задача обратная предыдущему пункту. Допустим, дано число long реализовать метод,
который вернет массив int состоящий из разрядов этого числа.
Например: 137->{1,3,7}

  137%10->          7
  137/10->13

  13%10->           3
  13/10->1

  1%10->            1
  1/10->0

     */

    public static int[] long2array(long num){

        // count the size of result array (how many digits in the num)
        // using String.valueOf
        String str = String.valueOf(num);
        int len=String.valueOf(num).length();

        // count the size of result array
        // using division
        int counter=1;
        int pow=10;
        while (num/pow>0){
            counter++;
            pow=pow*10;
        }

        int[] result= new int[counter];

        //fill the array
        for (int i = result.length-1; i>=0; i--) {
            result[i]=(int)num%10;
            num=num/10;
        }
        return result;
    }

}