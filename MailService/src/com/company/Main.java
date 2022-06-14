package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice=inputChoice();

        MailDeliveryService mailService =new MailServiceFactory().getMailService(choice);
        Sender sender = new Sender();
        System.out.println(sender.send(mailService));

    }

    public static int inputChoice(){
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Which service to use to send mail?");
            System.out.println("1.DHL  2.EMAIL  3.PIGEON");
            choice = sc.nextInt();
        }while (choice<1 || choice>3);
        sc.close();
        return choice;
    }
}
