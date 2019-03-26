package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopppingListAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> items= new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(!name.equals("q")) {
			System.out.println("Please enter item: ");
			name = scanner.nextLine();
			System.out.println("Please enter number");
			int number = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name, number));
			for (Item item: items) {
				System.out.println(item.name + "\t" +item.number);
			}
		}
		
		
		
		
	}

}
