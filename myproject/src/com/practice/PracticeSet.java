package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<20; i++) {
			list.add(0);
		}
		
		for(int i=0; i<10000; i++) {
			int r = random.nextInt(20);
			Integer f = list.get(r);
			list.set(r, f+1);
		}
		
		System.out.println(list);
	}
	
}
