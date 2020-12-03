package com.luv2code.springboot.demo.myfirstapp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.demo.myfirstapp.FoodItem;

@RestController
public class FunRestController {

	private List<FoodItem> menu;
	
	@PostConstruct
	public void addItemsToList() {
		menu = new ArrayList<FoodItem>();
		menu.add(new FoodItem("Dosa", 50));
		menu.add(new FoodItem("Fried Rice", 65));
		menu.add(new FoodItem("Roti", 40));
		menu.add(new FoodItem("Panner Butter Masala", 150));
		menu.add(new FoodItem("Veg Biryani", 90));
		menu.add(new FoodItem("Coffee", 10));
		menu.add(new FoodItem("Mango Juice", 60));
	}
	
	@GetMapping("/")
	public List<FoodItem> getMenuItems() {
		return menu;
	}

}
