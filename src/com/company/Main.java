package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;

import java.net.SocketOption;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	var item = new ClothingItem(ClothingItem.TSHIRST, ClothingSize.S, 24.55,3);

	var totalPrice = item.getPrice() * item.getQuantity();
	var formatter = NumberFormat.getCurrencyInstance();
	var output = String.format("your %s order of size %s will cost %s", item.getType(),item.getSize(), formatter.format(totalPrice));
	System.out.println(output);
    }
}
