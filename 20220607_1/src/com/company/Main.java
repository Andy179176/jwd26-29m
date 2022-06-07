package com.company;

public class Main {

    public static void main(String[] args) {
        int userChoice=1;
        Scannerable scanner=null;

        switch(userChoice){
            case 1: scanner= new Handy(); break;
            case 2: scanner= new MyScanner(); break;
            case 3: scanner= new PrinterScanner(); break;
        }



        System.out.println(scanDocument(scanner));

    }

    public static String scanDocument(Scannerable scanner){
        return scanner.scan();
    }

    public static void printDocument(Printer printer, String doc ){
        printer.print(doc);
    }

}
