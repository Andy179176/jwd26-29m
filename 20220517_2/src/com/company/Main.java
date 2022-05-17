package com.company;

public class Main {

    public static void main(String[] args) {
       int[][] arr= {
                     {1,2,3},
                     {2,4,6},
                     {9,8,4}
       };

       print(arr);
        System.out.println(arr[1][1]);
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print("arr["+i+"]["+j+"]="+arr[i][j] +"    ");
            }
            System.out.println();
        }

    }



}
