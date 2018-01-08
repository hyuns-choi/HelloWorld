package com.oraclejava.exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class io2 {
	public static void main(String[] arg) throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("myFile.txt"));
		
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
}
