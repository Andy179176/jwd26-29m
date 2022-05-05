package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первую строку");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = sc.nextLine();
        System.out.println("Введите третью строку");
        String str3 = sc.nextLine();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("Введите целое число:");
        int i= sc.nextInt();
        System.out.println(i);
    }
}
