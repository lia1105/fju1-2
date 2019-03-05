package com.lia;

public class Order {
	protected String dish;
	int price;
	
	public Order(String dish, int price) {
		this.dish=dish;
		this.price=price;
	}
	
	public void print() {
		System.out.println(dish + "\t" + price);
	}
}
