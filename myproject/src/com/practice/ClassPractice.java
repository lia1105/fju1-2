package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Map<Integer,Integer> v =new HashMap<>();
		for(int i=0; i<10000; i++) {
			int r =random.nextInt(20);
			Integer num = v.get(r);
			v.put(r,num== null? 1 : num + 1);
		
		}
		System.out.println(v);
		
	
	}

	
}
