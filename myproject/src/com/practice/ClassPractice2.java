package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int[] f = new int[20]; //陣列的方法
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			int r = random.nextInt(20);
			list.add(r);
			f [r]++;
		}
		
		for (int i=0; i<f.length; i++) {
			System.out.println(i + ":" + f[i]);
			
		}
	}

}
