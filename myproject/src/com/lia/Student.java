package com.lia;

public class Student {
	protected String name;
	private int english;
	
	
	public Student (String name, int english) {
		this.name=name;
		this.english=english;
	}
	public void print() {
		System.out.println(name + "\t" + english );
	}
	
	public void setEnglish(int English) {
		if (english<= 100 && english>=0) {
		this.english = english;
	}
	}	
}
