package com.company;
/*
Implement the method that print the String, which consists of given char of the given source string and
repeated as many times as the given character occurs in the source string
“It’s new task for me”,’e’ -> “ee”;

 */



public class Main {

    public static void main(String[] args) {
        // Variant 1
        printStringByChar("It's new a task for me. It is easy for me!", 'a');

        //Variant 2
        printChars('a',countCharsInTheString("It's new a task for me. It is easy for me!", 'a'));
    }

    // Variant 1
    public static void printStringByChar(String str, char ch){
        for (int i = 0; i < str.length(); i++) {
            char currentChar= str.charAt(i);

            if(currentChar==ch){
                System.out.print(currentChar);
            }
        }
        System.out.println();
    }

    // Variant 2
    public static int countCharsInTheString(String str, char ch){
        int result=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                result++;
            }
        }

        return result;
    }

    public static void printChars(char ch, int count){
        for (int i = 0; i <count ; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }




}
