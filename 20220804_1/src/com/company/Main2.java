package com.company;
/*
Дан в котором записаны результаты подбрасывания монетки (true\false соответственно орел\решка)
Необходимо вычислить самую длинную последовательность «орлов» .
{true,true,false,true,false,true,true,true,false}->3

 */

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Boolean> list = List.of(true,true,false,true,false,true,true,true,true,true);
        System.out.println(longestSubsequence(list, true));
    }

    public static int longestSubsequence(List<Boolean> list, boolean value){
        int maxSubsequence=0;
        int currentCounter=0;
        for (Boolean b:list) {

            if(b==value){
                currentCounter++;
            } else {
                maxSubsequence=Math.max(maxSubsequence,currentCounter);
                currentCounter=0;
            }
        }
        maxSubsequence=Math.max(maxSubsequence,currentCounter);
        return maxSubsequence;
    }
}
