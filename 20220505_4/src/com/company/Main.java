package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	  int[] arr1={1,3,5,7,8,11};
	  printArray(arr1);
	  int[] arr2=copyArray2(arr1,20);
	  arr1=copyArray2(arr1,20)
	  printArray(arr2);
	  arr1[0]=100;
      System.out.println("--------------------------");
      printArray(arr1);
      printArray(arr2);
    }
    public static void printArray(int[] array ){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ "  ");
        }
        System.out.println();
    }
    public static int[] copyArray(int[] array, int newLength){
        int[] result= new int[newLength];

        for (int i = 0; i < result.length ; i++) {
            if(i<array.length) {
                result[i] = array[i];
            }
        }
        return  result;
    }

    public static int[] copyArray2(int[] array, int newLength){
        return Arrays.copyOf(array,newLength);
    }

}
