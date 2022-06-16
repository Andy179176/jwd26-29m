package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Given a list of Person (String name, List<BankAccount> accounts) .
    BankAccount is the class with following fields: String iban, double balance.
    Create class BankAccountWithOwner (Person owner, String iban, double balance).
    Implement the method that returns the List of BankAccountWithOwner.

     */


    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("1111", 20.3);
        BankAccount ba2 = new BankAccount("1112", 20.3);
        BankAccount ba3 = new BankAccount("1113", 20.3);
        BankAccount ba4 = new BankAccount("1114", 20.3);

        List<BankAccount> accounts1 = new ArrayList<>();
        accounts1.add(ba1);
        accounts1.add(ba2);
        accounts1.add(ba3);
        accounts1.add(ba4);


        Person p1 = new Person("Jack");
        p1.addAccount(accounts1);

        Person p2 = new Person("John");
        p2.addAccount(new BankAccount("2111", 109.3));
        p2.addAccount(new BankAccount("2112", 109.3));
        p2.addAccount(new BankAccount("2113", 109.3));

        Person p3 = new Person("Anna");
        p3.addAccount(new BankAccount("3111", 101.3));
        p3.addAccount(new BankAccount("3112", 101.3));


        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        Person p4 = new Person("Nick");
        p4.addAccount(new BankAccount("12345", 123456));
        people.add(p4);

        System.out.println(people);

        System.out.println("---------------------- RESULT ---------------------");
        List<BankAccountWithOwner> res = person2listAccountWithOwner(people);
        for (BankAccountWithOwner bao : res) {
            System.out.println(bao);
        }
    }

    public static List<BankAccountWithOwner> person2listAccountWithOwner(List<Person> list) {
        List<BankAccountWithOwner> result = new ArrayList<>();
        if (list == null || list.isEmpty()) return result;
        for (Person p : list) {
            result.addAll(p.getlistAccountWithOwner());
        }
        return result;
    }

}
