package com.practice3;

public class Horse extends Thread {

	@Override
	public void run() {
		
		/*for (int i=1; i<=1000; i++) {
			System.out.println("Horse2:" + i);
		} */
		
		for (int i=1; i<=1000; i++) {
			System.out.println(getName() + i);
		}
		
	}
			
	
}
