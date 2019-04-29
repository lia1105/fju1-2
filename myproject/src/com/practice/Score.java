package com.practice;

import java.util.Scanner;

public class Score {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("請輸入數學成績");
			Score math =new Score(scanner.nextLine());
			System.out.println("請輸入英文成績");
			Score english =new Score(scanner.nextLine());
			int avg = (math.value + english.value)/2;
			System.out.println("平均:" + avg);
			
		} catch (ArithmeticException e ) {
			System.out.println("數值運算錯誤");
		} catch (NumberFormatException e ) {
			System.out.println("數字格式錯誤");
	}

	}
}
