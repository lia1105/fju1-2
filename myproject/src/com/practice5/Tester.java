package com.practice5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("data.txt"));
			String line = in.readLine();
			String lastCity = "";
			while(line!= null) {
				System.out.print(line);
				String[] tokens = line.split(",");
				
				if (!tokens[0].equals(lastCity)) {
					cities.add(tokens[0]);
				}
				areas.add(tokens[1]);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(cities);
	}
		
}
