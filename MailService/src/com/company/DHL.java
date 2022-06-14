package com.company;

public class DHL implements MailDeliveryService {
    private double stampPrice = 2.5;

    public DHL(double stampPrice) {
        this.stampPrice = stampPrice;
    }

    @Override
    public String sendMail() {
        return "Put a letter in an envelope, buy stamp "+ buyStamp() + ", put a stamp, send";
    }
    public   double buyStamp(){
        return stampPrice;
    }
}
