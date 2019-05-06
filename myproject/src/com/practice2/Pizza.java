package com.practice2;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Pizza想切幾片?");
			int num = Integer.parseInt(scanner.nextLine());
			if (num == 0) {
				System.out.println("你確定不要切?");
			} else if (num>0 && num<8 ) {
				System.out.println("數量錯誤");
			} else if (num>8 && num<12 ) {
				System.out.println("數量錯誤");
			} else if (num>12 && num<16) {
				System.out.println("數量錯誤");	
			} else if (num<0 || num>16) {
				System.out.println("超出範圍");
			} 
			
		} catch (NumberFormatException e) {
			System.out.println("格式錯誤");
		}
		
		
	}

}
