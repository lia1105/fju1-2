package com.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> shoppingList = new HashMap<>();
		String key1 = "milk";
		String key2 = "bread";
		shoppingList.put(key1,2);
		shoppingList.put(key2,3);
		System.out.println(shoppingList);
		
	}
	
}
