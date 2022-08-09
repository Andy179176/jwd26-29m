package com.company;

import java.util.Arrays;

/*
5.	Анагра́мма — строка, составленная путем перестановки букв исходной строки,
например “ABB CAA“ - “BA BCAA“ -> “CBA BAA“ ……
В задаче дано 2 строки и символов латинского алфавита и пробелов,
нужно определить, являются ли они анаграммами.
Если знаете, предложите несколько алгоритмов\подходов к решению данной задачи.

 */
public class Main4 {
    public static void main(String[] args) {
// “ABB CAA“ - “BA BCAA“
// " AAABBC" - " AAABBC"

        System.out.println((int)' ');

        System.out.println(isAnagram2("ABB CAA","BA BCAA"));
        System.out.println(isAnagram2("ABB cAa","bA BCAA"));
        System.out.println(isAnagram2("BB CAA","BA BAA"));
        System.out.println(isAnagram2("ABBB CAA","BA BCAA"));



    }

    public static  boolean isAnagram(String string1, String string2){
        if(string1!=null&& string2!=null){
            String s1=preProcessing(string1);
            String s2=preProcessing(string2);

            if(s1.length()==s2.length()){
                char[] charS1=s1.toCharArray();
                char[] charS2=s2.toCharArray();
                Arrays.sort(charS1);
                Arrays.sort(charS2);
                return Arrays.equals(charS1,charS2);
            }
        }
        return false;
    }


    public static  boolean isAnagram2(String string1, String string2){
        final int CODE_TABLE=128;

        if(string1!=null&& string2!=null){
            String s1=preProcessing(string1);
            String s2=preProcessing(string2);

            if(s1.length()==s2.length()){

                int[] counterArr= new int[CODE_TABLE];
                for (int i = 0; i <s1.length() ; i++) {
                    counterArr[s1.charAt(i)]++;
                    counterArr[s2.charAt(i)]--;
                }
                for (int i = 0; i <counterArr.length ; i++) {
                    if(counterArr[i]!=0) return false;
                }
                return true;
            }
        }
        return false;
    }


    private static String preProcessing(String string) {
        return string.toLowerCase();
    }


}

