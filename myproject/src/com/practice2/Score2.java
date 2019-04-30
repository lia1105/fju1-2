package com.practice2;

public class Score2 {

	int value;
	public Score2(String s) throws FormatException {
		try {
			value = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			throw new FormatException();
		}
	}
		
	



}
