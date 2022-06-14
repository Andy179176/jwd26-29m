package com.company;

public class Email implements MailDeliveryService{

   @Override
    public String sendMail(){

       return "Send by internet";
    }
}
