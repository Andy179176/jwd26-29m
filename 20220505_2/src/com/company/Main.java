package com.company;

public class Main {

    public static void main(String[] args) {
	printResult(10,20,add(10,20),'+');
	printResult(10,20,sub(10,20),'-');
    }

    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }

    public static void printResult(int num1, int num2, int result, char operation){
        System.out.println(num1+" "+ operation+ " "+num2+" = "+result);
    }








}
