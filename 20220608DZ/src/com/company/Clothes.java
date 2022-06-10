package com.company;

public class Clothes extends Item {
    private int discountPercent;

    public Clothes(String name, double price) {
        super(name, price);
    }


    @Override
    public String buy() {

        return "[Clothes] Bay "+ getName() + " price "+sellingPrice() +
                " delivery is " + getBaseDeliveryPrice();

    }

    @Override
    public int discountPercent() {
        return discountPercent;
    }

    @Override
    public void setDiscountPercent(int percent) {
        discountPercent=percent;
    }


}
