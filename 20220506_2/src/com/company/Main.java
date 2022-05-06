package com.company;
/*
4.Реализуйте свой собственный метод разделения. Он должен разбивать заданную строку вокруг совпадений
        разделителя символов. В результате он должен возвращать массив подстрок. Не используйте метод String.split,
        например:
        (“Java очень проста!”, ’ ‘) -> {“ Java”,”is”, ”very”,”easy”}
        (“Java is very easy!”, ’v‘) -> {“Ja”,“a is”, ”ery easy”}
        (“Java is very easy!”,’!‘) -> {“ Java is very easy”}
        (“Java is very easy!”,’:‘) -> {“ Java - это очень просто!”}
 */



public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        int index=6;
        array[0] =10;
        array[10]=10;
        array[index]=10;
        array[index+1]=10;
        array[index+1]=array[index];
        String[] array = new String[5];
        String[] array = new String[index];
        String[] temp  = new String[countChars("ssdf",7)+1];
        */
    }
    public static String[] split(String str, char delimiter ){
        String[] temp  = new String[countChars(str,delimiter)+1];

        String word="";
        int index=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            if(ch!=delimiter){
                word=word+ch;
            } else {
                temp[index]=word;
                index++;
                word="";
            }
        }
       return temp;

    }

    public  static int countChars(String str, char ch){
        int result=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)==ch){
                result++;
            }
        }
        return result;
    }

}
