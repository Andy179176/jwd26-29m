package com.company;

public class Sender {

    public String send(MailDeliveryService service) {

        return service.sendMail();
    }
}
