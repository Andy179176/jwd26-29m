package com.company;

public class PrinterScanner implements Printer,Scannerable{
    @Override
    public void print(String s) {
        System.out.println("Греется.....");
        System.out.println("Печатает.....");
        System.out.println(s);

    }

    @Override
    public String scan() {
        System.out.println("Сканирую документ");
        return "The document.....";
    }
}
