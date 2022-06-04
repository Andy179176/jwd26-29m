package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

       /*
        {(ksh([fd]k)}

        */






        System.out.println(list);


    }

    public static boolean checkBrackets(String str){
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            switch (ch){
                case '{': stack.push('}'); break;
                case '(': stack.push(')'); break;
                case '[': stack.push(']'); break;
                case '}':
                case ')':
                case ']':
                    if(stack.isEmpty()|| stack.pop().charValue()!=ch)
                        return false;

            }
        }
        return stack.isEmpty();
    }

}
