package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Food("cheese telsiter", 5));
        items.add(new Food("meat", 9.50));
        items.add(new Clothes("shirt", 29.90));
        items.add(new Clothes("jeans", 35.90));
        items.add(new Notebook("Acer", 1299.99));
        items.add(new Phone("samsung", 735.00));

        for (Item i:items) {
            System.out.println(i.buy());
        }

    }
}
