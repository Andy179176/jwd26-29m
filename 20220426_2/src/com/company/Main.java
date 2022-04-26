package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1={1,3,4,5,0};
        int[] arr2={-1,-3,-4,5,0,1,73};
        int[] arr3= new int[25];
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        int minValue1=findMinValue(arr1);
        System.out.println("min value in the first array="+minValue1);

        int minValue2=findMinValue(arr2);
        System.out.println("min value in the second array="+minValue2);

        int[] arr4=createNewArray(14);
        printArray(arr4);
    }

    public static void printArray(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            System.out.print("["+i+"]="+ arr[i]+"  ");
        }
        System.out.println();

    }

    public static int findMinValue(int[] arr){
       int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return  min;
    }

    /*
         public static TYPE NAME( parameters ){

         }

    */
    public static int[] createNewArray(int size){
        int[] result = new int[size];
        for (int i = 0; i < result.length ; i++) {
           result[i]=i*2;
        }
        return result;
    }


}
