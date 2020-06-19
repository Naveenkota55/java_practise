package com.company.model;

public class ClothingItem{
    private String type;
    private String size;
    private double price;
    private int quantity;

    public static ClothingItem(String type, String size, Double price, int quntity){
        this.type=type;
        this.size=size;
        this.price=price;
        this.quntity=quntity;


    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size=size;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
