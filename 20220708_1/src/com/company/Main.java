package com.company;
/*
Допустим, вы пишите банковскую программу. У вас есть клиенты: юридические лица,
физические лица, вип-клиеты. У каждого клиента есть Account{String ibann, double balance}.
Условиями бизнеса предусмотрено, что по каждому счету начисляются проценты и после
начисления клиентов информируют о балансе. На счета физических лиц проценты
начисляется базовый процент. На счета юр.лиц начисляется процент, но при условие что
остаток на счете не менее 10000. На счета вип-клиетов начисляется базовый процент
плюс бонус. Информирование тоже осуществляется по разному: юр.лица и физ.лица
получают выписку письмом, вип клиеты получают письмом и емэйлом. Вам необходимо
разработать систему классов, реализовать метод начисления и метод информирования.
Естественно, программа должна иметь возможность обрабатывать клиентов\счета списком.
 */


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClientLegal c1= new ClientLegal("ClientLLegal1", new Account("DE11111",10000));
        ClientIndividual c2= new ClientIndividual("ClientIndi1", new Account("DE20001",40000));
        ClientVip c3= new ClientVip("ClientVip1", new Account("DE33001",100000));

        List<Client> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        for (Client c:list ) {
            c.calcPercent();
        }



    }
}
