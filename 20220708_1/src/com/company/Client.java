package com.company;

public abstract class Client {
    private String name;
    private Account account;
    private double basePercent = 10;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public String toString() {
        return name + " ("+ account+")";
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public double getBasePercent() {
        return basePercent;
    }

    public abstract  void calcPercent();

}
