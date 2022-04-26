package com.company;

public class Main {

    public static void main(String[] args) {
        int   a  =10;
        int[] arrOfIntegers={1,2,3,4,5,8,8};
        String[] arrOfString={"ab","cd","e","fjklh"};

        System.out.println(arrOfIntegers[0]);
        System.out.println(arrOfIntegers[2]);
        //System.out.println(arrOfIntegers[5]); //ArrayIndexOutOfBoundsException
        System.out.println("length="+arrOfIntegers.length);

        for(int i=0; i<arrOfIntegers.length;i++){   // i= 0   1   2   3   4
            System.out.print("["+i+"] = "+arrOfIntegers[i] + "  ");
        }

        int[] arr2= new int[4];
        for (int i=0; i<arr2.length;i++){
            arr2[i]= i+100;
        }
        System.out.println();

        for (int i = 0; i < arr2.length ; i++) {
            System.out.print("["+i+"] = "+arr2[i] + "  ");
        }

    }
}
