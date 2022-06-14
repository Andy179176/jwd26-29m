package com.company;

public class Pigeon implements MailDeliveryService {

    @Override
    public String sendMail() {
        return "Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away";
    }
}
