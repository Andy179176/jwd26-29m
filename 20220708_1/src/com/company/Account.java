package com.company;

public class Account {
    private String ibann;
    private double balance;


    public Account(String ibann, double balance) {
        this.ibann = ibann;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ibann +" balance=" + balance;
    }

    public void calcPercent(double percent){
        balance= balance+ (balance/100*percent);
    }

    public  void addBonus(double bonus){
        balance+=bonus;
    }

    public double getBalance() {
        return balance;
    }
}
