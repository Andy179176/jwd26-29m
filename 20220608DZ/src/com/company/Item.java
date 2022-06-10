package com.company;

public abstract class Item {
    protected String name;
    private double price;
    private double baseDeliveryPrice;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public double sellingPrice() {
        return getPrice()-(getPrice()*0.01*discountPercent());
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getBaseDeliveryPrice() {
        return baseDeliveryPrice;
    }

    public void setBaseDeliveryPrice(double baseDeliveryPrice) {
        this.baseDeliveryPrice = baseDeliveryPrice;
    }

    public abstract String buy();
    public abstract int discountPercent();
    public  abstract void setDiscountPercent(int percent);


}
