package com.company;

public class ClientVip extends Client {

    private double bonus=5000;

    public ClientVip(String name, Account account) {
        super(name,account);
    }
   public void calcPercent(){
        getAccount().calcPercent(getBasePercent());
        getAccount().addBonus(bonus);
        inform();
    }
    private void inform(){
        System.out.println("Письмо: Уважемый " + getName() + " ваш баланс: " + getAccount());
        System.out.println("Email: Уважемый " + getName() + " ваш баланс: " + getAccount());

    }


}
