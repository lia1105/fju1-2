package com.practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Practice0521 {

	public static void main(String[] args) {
		try {
			
			FileWriter fw = new FileWriter("data.txt");
			FileInputStream fis = new FileInputStream("aa.txt");
			Reader in = new InputStreamReader(fis);
			int n = in.read();
			while (n != -1) {
				System.out.print((char)n);
				n = in.read();
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
