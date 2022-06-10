package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> temp = new LinkedList<>();
        temp.

    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] totalAr = new int[array1.length + array2.length]; //создаем общий массив длинной в два, которые хотим объединить
        int indexArr1 = 0, indexArr2 = 0, indexTotalAr = 0; //выставляем нулевые позиции для слияния
        while (indexTotalAr < totalAr.length) { // цикл, пока общий массив не заполнится
            totalAr[indexTotalAr++] = (array1[indexArr1] <= array2[indexArr2]) ? array1[indexArr1++] : array2[indexArr2++];
            //записываем число из первого или из второго массива в общий, в зависимости от того, какое меньше и увеличиваем индекс того, из
            // которого записали, а также индекс общего массива
            if (indexArr1 == array1.length) { //если кончился первый массив, то записываем весь остаток из второго массива
                for (int i = indexTotalAr; i < totalAr.length; i++) {
                    totalAr[indexTotalAr++] = array2[indexArr2++];
                }
            }
            if (indexArr2 == array2.length) { //если кончился второй массив, то записываем остаток из первого
                for (int i = indexTotalAr; i < totalAr.length; i++) {
                    totalAr[indexTotalAr++] = array1[indexArr1++];
                }
            }
        }
        return totalAr;
    }

    public static int [] mergeSort (int[] unsArr){

        if (unsArr.length < 2){ // условие выхода из рекурсии - как только разделили массивы до одного элемента
            return unsArr;
        }

        int [] left = new int[unsArr.length/2];
        System.arraycopy(unsArr,0,left,0,left.length);
        int [] right = new int[unsArr.length - unsArr.length/2];
        System.arraycopy(unsArr,unsArr.length/2,right,0,right.length);

        // делаем два массива - левая часть основного и правая часть основного

/*
        // изначально было написано вот так:
        mergeSort(left);
        mergeSort(right);

        unsArr=merge(left,right);
        // и оно не работало

 */
        unsArr=merge(mergeSort(left),mergeSort(right)); // отправляем полученное из рекурсии в метод слияния
        return unsArr;
    }

}