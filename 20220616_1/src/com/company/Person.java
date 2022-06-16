package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<BankAccount> accounts=null;

    public Person(String name, List<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public boolean addAccount(BankAccount ba){
        if(accounts==null) accounts=new ArrayList<>();
        return accounts.add(ba);
    }

    public boolean addAccount(List<BankAccount> ba){
        if(accounts==null && ba!=null) {
            accounts=new ArrayList<>(ba);
            return true;
        }
        else{
            return accounts.addAll(ba);
        }
    }


    public  List<BankAccountWithOwner> getlistAccountWithOwner() {
        List<BankAccountWithOwner> result = new ArrayList<>();
        if (accounts == null || accounts.isEmpty()) return result;
        for (BankAccount acc : accounts) {
            result.add(new BankAccountWithOwner(this, acc.getIban(), acc.getBalance()));
        }

        return result;
    }



    @Override
    public String toString() {
        String acc=System.lineSeparator();
        if(accounts!=null&&!accounts.isEmpty()){
            for (BankAccount ba:accounts) {
                acc+="  "+ba.toString() + System.lineSeparator();
            }
        } else {
            acc= " there are no any accounts";
        }

        return  name + acc;

    }
}
