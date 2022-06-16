package com.company;
/*
Imagine in our program we process an array (for example, an array
of integers, or an array of Employee if you want). In production environment
we read this array from User (use Scanner), in test environment we
get it as random array or use an array defined in the code.
So, you need to implement a method getArray() witch as argument takes the way,
how the array will be created and as a result returns the array.
Implement this program (hint: use knowledge about interface)
 */


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      int wayNumber = 2;

      // -------------------------------------------------

        ArrayService arrayService = new ArrayServiceFabric().getArrayService(wayNumber);


        System.out.println(Arrays.toString(arrayService.getArray()));


    }
}
