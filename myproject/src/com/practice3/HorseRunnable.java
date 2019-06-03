package com.practice3;

public class HorseRunnable extends Thread {

	public HorseRunnable(String name) {
		setName(name);
	}
	
	
	@Override
	public void run() {
		
		for (int i=1; i<=1000; i++) {
			System.out.println("Horse1:" + i);
		}
		
				
	}

}
