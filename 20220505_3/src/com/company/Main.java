package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] a= new int[10];
        int[] b = array;
        array[1]=100;
       print(array);
       print(b);

    }
    public static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
