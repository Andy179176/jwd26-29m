package com.company;

public class MyScanner implements Scannerable {
    @Override
    public String scan() {
        System.out.println("Сканирую....");
        return "The scanned document return ";
    }
}
