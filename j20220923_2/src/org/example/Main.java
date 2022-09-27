package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Дана строка (для простоты можно считать,  слова разделены одним пробелом
и строка не содержит знаков препинание и т.д.).
//    Используя стрим, получить map<String, Integer> где ключ – слово,
значение – сколько раз это слово встречается в строке.



 */
public class Main {
    public static void main(String[] args) {


        String str="сколько, в раз это в слово встречается в строке";
        System.out.println(solution(str));
    }

    private static Map<String,Integer>  streamObjectCounting(Stream<String> stringStream){
        return stringStream.collect(Collectors.toMap(s->s,s->1,(s1,s2)->++s1));
    }


   private static Stream<String> stringToStream(String str){
        return Arrays.stream(str.split(" "));
    }

   public static  Map<String,Integer> solution(String str){
       return streamObjectCounting(stringToStream(str));
   }


}