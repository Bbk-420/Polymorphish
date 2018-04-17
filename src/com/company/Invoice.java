package com.company;

public class Invoice implements Payable{
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public int getPartNumber() {

        return partNumber;
    }

    public void setPartNumber(int partNumber) {

        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public double getPricePerItem() {

        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {

        this.pricePerItem = pricePerItem;
    }

    @Override
    public double payment() {
        return quantity*pricePerItem;
    }

}
