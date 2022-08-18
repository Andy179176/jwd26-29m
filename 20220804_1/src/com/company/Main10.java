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


public class Main10 {
    public static void main(String[] args) {
        int n=4;
        solution(2*n,"",0);
    }

    public static void solution(int n, String s, int openBrackets){
        if(s.length()== n){
            System.out.println(s);
            return;
        }
        if(n>s.length()+openBrackets) {
            solution(n, s + "(", openBrackets + 1);
        }
        if (openBrackets>0) {
            solution(n, s + ")", openBrackets - 1);
        }
    }


}

