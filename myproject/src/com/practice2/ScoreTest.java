package com.practice2;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter English");
		try {
			Score2 english = new Score2(scanner.nextLine());
		} catch (FormatException e) {
			e.printStackTrace();
		}
	}

}
