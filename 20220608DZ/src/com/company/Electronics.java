package com.company;

public abstract class Electronics extends Item{
    private int discountPercent;


    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public String buy() {
        return "[Electronics] Bay "+ getName() + " price "+sellingPrice() +
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
