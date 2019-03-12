package com.lia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> order = new ArrayList<String>();
		
		order.add("bigMac");
		order.add("iceCream");
		order.add("bigMac");
		System.out.println(order);
		
		Set<Integer> memberNum = new HashSet<>();
		
		memberNum.add(1);
		memberNum.add(2);
		memberNum.add(3);
		memberNum.add(1);
		System.out.println(memberNum);
		
	}

}
