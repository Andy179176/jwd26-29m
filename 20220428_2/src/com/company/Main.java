package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array=new int[]{1,2,3};
        int[] arr123=array;

        array[2]=100;

        int a1=3;
        int b1=a1;

        System.out.println("1a: before method");
        printArray(array);
        int[] array2=m4(array);
        System.out.println("2a: after method array");
        printArray(array);
        System.out.println("2a: after method array2");
        printArray(array2);
        array2[0]=30;
        System.out.println("finish:");
        printArray(array);

        System.out.println();
        System.out.println("--------------------------------------");
	   int a=10;
        System.out.println("1: before method a= "+a); //10
       int b=m1(a);
        System.out.println("2: after method a= "+a); //10  //20
        System.out.println("b= "+b); //20
    }
    public static int[] m4(int[] array){
        array[0]=110;
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"    ");
        }
        System.out.println();
    }


    public static int[] reversArray(int[] array){

    }


    public static int m1(int a){
        System.out.println("3: before in the method a= "+a); //10
        a=a+10;
        m2(a);
        System.out.println("4: before in the method a= "+a); //20

        return a;
    }

    public static int m2(int a){
        a=a+10;
        System.out.println("hello all");
        return a;
    }
}
