package com.company;

public class Handy implements  Scannerable{
    @Override
    public String scan() {
        System.out.println(" Включите и наведите камеру.....");
        System.out.println(" Фотографирую......Распознаю.....");
        return "Scanned document";
    }
}
