package com.luv2code.springboot.demo.myfirstapp;

public class FoodItem {

	private String name;
	private float price;
	
	public FoodItem() {
		// TODO Auto-generated constructor stub
	}

	public FoodItem(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
