package com.company;

public class Main {

    public static void main(String[] args) {
	   int[] arr= {1,2,3};
	   int[] arr1= {1,2,3,0,4,345,9};


        printArray(arr1,-2,3);

	   String str;
        ///
        str="hello";
    }

    public static void printArray(int[] array, int start, int finish){
        boolean isArgumentsNotCorrect= start<0|| finish<0||start>=array.length||finish>=array.length||
                start>=finish;
        if(!isArgumentsNotCorrect) {

            for (int i = start; i < finish; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray(int[] array){

    }

}






