package com.company;

public class BankAccountWithOwner {
    Person owner;
    String iban;
    double balance;

    public BankAccountWithOwner(Person owner, String iban, double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccountWithOwner: " + owner.getName() + " " + iban + " (" + balance + ')';
    }

}
