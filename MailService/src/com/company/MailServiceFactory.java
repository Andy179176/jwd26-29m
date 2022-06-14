package com.company;

public class MailServiceFactory {

    public MailDeliveryService getMailService(int choice) {
        boolean isBerlin=true;
        switch (choice) {
            case 1:
                if(isBerlin){
                    return new DHL(1.5);
                }else{
                    return new DHL(4.0 );
                }
            case 2:
                return new Email();
            case 3:
                return new Pigeon();
        }
        return null;
    }
}
