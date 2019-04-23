package com.practice;

import java.util.Scanner;

public class GradesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入數學:");
		String number = scanner.nextLine();
		try {
			int math = Integer.parseInt(number);
			
			System.out.println("數學:" + math);
		} catch (ArithmeticException e ) {
			System.out.println("成績應為0~100");
		} catch (NumberFormatException e ) {
			System.out.println("格式錯誤");
		}
			
	}

}
