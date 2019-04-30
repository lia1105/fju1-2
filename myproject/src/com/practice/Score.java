package com.practice;

import java.util.Scanner;

public class Score {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("請輸入數學成績");
			int math = Integer.parseInt(scanner.nextLine());
			if (math>100 || math<0) {
				math = (Integer) null;
			}
			System.out.println("請輸入英文成績");
			int eng =Integer.parseInt(scanner.nextLine());
			if (eng>100 || eng<0) {
				eng = (Integer) null;
			}
			int avg = (math + eng)/2;
			System.out.println("平均:" + avg);
			
		} catch (NullPointerException e ) {
			System.out.println("成績應為0~100");
		} catch (NumberFormatException e ) {
			System.out.println("訊息格式錯誤");
	}

	}
}
