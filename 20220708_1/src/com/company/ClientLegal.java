package com.company;

public class ClientLegal extends Client{

    private double minLegalBalance=1000;

    public ClientLegal(String name, Account account) {
        super(name,account);
    }

    public void calcPercent(){
        if(getAccount().getBalance()>minLegalBalance) {
            getAccount().calcPercent(getBasePercent());
        }
        inform();
    }

    private void inform(){
        System.out.println("Письмо: Уважемый " + getName() + " ваш баланс: " + getAccount());
    }

}
