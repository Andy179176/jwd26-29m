package com.company;

public class Food extends Item  {
    private double deliveryPrice=4.0;
    private int discountPercent;


    public Food(String name, double price) {
        super(name, price);
    }

    public double getDeliveryPrice() {
        return getBaseDeliveryPrice()+deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String buy() {

        return "[Food] Bay "+ getName() + " price "+sellingPrice() +
                " as food delivery is " + getDeliveryPrice();
    }

    @Override
    public int discountPercent() {
        return discountPercent;
    }
}
