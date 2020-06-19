package com.company;

import com.company.model.ClothingItem;

import java.net.SocketOption;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	var item = new ClothingItem();
	item.setType("Shirt");
	item.setSize("M");
	item.setQuantity(3);
	item.setPrice(19.99);

	var totalPrice = item.getPrice() * item.getQuantity();
	var formatter = NumberFormat.getCurrencyInstance();
	var output = String.format("your %s order will cost %s", item.getType(), formatter.format(totalPrice));
	System.out.println(output);
    }
}
