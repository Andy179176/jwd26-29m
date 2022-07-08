package com.company;

public class ClientIndividual extends Client {

    public ClientIndividual(String name, Account account) {
      super(name, account);
    }

    public void calcPercent(){
        getAccount().calcPercent(getBasePercent());
        inform();
    }

    private void inform(){
        System.out.println("Письмо: Уважемый " + getName() + " ваш баланс: " + getAccount());
    }


}
