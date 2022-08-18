package com.company;
/*
Дано целое число n (0<n<8). Требуется вывести все правильные скобочные последовательности длины 2n.
В задаче используются только круглые скобки.
2 –> (()) ,
     ()()
3 -> ((())),                       ())(  )(() ((()  ()() ())) (()) ((((   ))))=> 1110  1010 1011  1100 1111 0000
     (()()),
     (())(),
     ()(()),
     ()()()
 */


/*
       n bit
 1000  ()))     8    2^(n-1)      n: 2^(n-1) <  2^n -1
 1001  ())(
 1010  ()()
 1011  ()((
 1100  (())
 1101  (()(
 1110  ((()
 1111  ((((    16-1   2^n -1
10000          16

 */

public class Main9 {
    public static void main(String[] args) {
        solution(10);

    }

    public static void solution(int n){
        n=n*2;
        int num1=(int)Math.pow(2,n-1);
        int num2=(int)Math.pow(2,n);
        for (int i = num1; i <num2 ; i+=2) {
            String binary =Integer.toBinaryString(i);
            if(check(binary)) {
                System.out.println(toBracketsString(binary));
            }
        }

    }

    public static  boolean check(String str){
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            counter=(str.charAt(i)=='1')? counter+1: counter-1;
            if(counter<0) return false;
        }
        return counter==0;

    }
    public static String toBracketsString(String str){
        return  str.replaceAll("1","(")
                   .replaceAll("0",")");
    }

}
