package com.practice4;

public class Wizard extends Thread{
	public void thunder() {
		System.out.println("THUNDER START!!");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THUNDER END!!");
	}
	
	@Override
	public void run( ) {
		thunder();
	}
	
	//以下不更動 得結果THUNDER START!! THUNDER END!! THUNDER START!! THUNDER END!!
	
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		w2.start();
	}

}
