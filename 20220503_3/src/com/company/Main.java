package com.company;
/*
Implement the method that counts how many words in the given String.
The words are separate by space. You have to use only length() and charAt() methods of String class.
“It’s new task for me” -> 5;
 */

public class Main {

    public static void main(String[] args) {
	String str="write your code here";
        System.out.println(countWords(str));
        System.out.println(countWords2(str));

    }

    public static int countWords(String str){
        int count;
        if (str!=""){
            count=1;
        } else {
            return 0;
        }

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;

    }


    // Variant 2
    //     (boolean  )? result if true  : result if false;


    public static int countWords2(String str){
        return countCharsInTheString(str,' ')+ ( (str=="") ? 0:1);
    }

    public static int countCharsInTheString(String str, char ch){
        int result=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                result++;
            }
        }
        return result;
    }



}
