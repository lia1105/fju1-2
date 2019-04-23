package com.practice;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bonus = 2000000;
		int div = 0; 
		Scanner scanner = new Scanner(System.in);
		System.out.print("有多少人分?");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			div = bonus/n;
			System.out.println("每人分得:" + div);
		} catch (ArithmeticException e ) {
			System.out.println("數值運算錯誤");
		} catch (NumberFormatException e ) {
			System.out.println("數字格式錯誤");
		}
		
		
		
	}

}
