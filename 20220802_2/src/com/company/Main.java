package com.company;

import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        int a=10;
        int b=10;

        CloseableResource cr1= new CloseableResource(10,2);
        System.out.println(cr1.div());

        div1(a,b);

    }


    static void div(int a,int b){

        try{
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("Hi");
            return;
        } finally {
            System.out.println("Hi from finally");
        }

    }


    static void div1(int a,int b){

        try (CloseableResource cr=new CloseableResource(a,b)){
            System.out.println(cr.div());
        } catch (ArithmeticException e){
            System.out.println("Hi");
            return;
        }



    }




}
