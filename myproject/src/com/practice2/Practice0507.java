package com.practice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.plaf.basic.BasicBorders.FieldBorder;

public class Practice0507 {

	public static void main(String[] args) {
		File dir = new File("C:\\AppServ");
		if (dir.exists() && dir.isDirectory()) {
		File[] files= dir.listFiles();
		for (File f: files) {
			if (f.isFile()) {
				System.out.println(f.getName());
			}
		}
		System.out.println(dir.mkdir());
		File dd = new File(dir,"aaa\\bbb");
		System.out.println(dd.mkdirs());
	
		
		}
		
		/*File dir = new File("C:\\AppServ");
		if (dir.exists() && dir.isDirectory()) {
			String[] files = dir.list();
			for (String s: files) {
				System.out.println(s);
			}
		} */
		
		
		/*try {
		FileReader fr = new FileReader("aa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
	}

}
