package com.company;
/*
Exception: try,catch, finally, throw, throws
*/

public class Main {

    public static void main(String[] args) {
        //System.out.println(10/0);
        //String s= null;
        //s.length();
        int res;
        try {
            res = div(10, 0);
            System.out.println(res);
        } catch (ArithmeticException e){
            System.out.println("Error: на 0 делить нелззя");

        }


    }

    public static int div(int a, int b) throws  ArithmeticException{
        int res=0;

            res = a / b;

        return res;
    }



}
