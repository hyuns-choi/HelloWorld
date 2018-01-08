package com.oraclejava.exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class io {
	public static void main(String[] arg) throws IOException {
		File myFile = new File("myFile.txt");
		if(myFile.exists()) {
			System.out.println("파일이 존재합니다.");
		}
		else {
			System.out.println("파일이 존재하지않습니다.");
			try {
				myFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		PrintWriter writer;
		try {
			writer = new PrintWriter(myFile);
			writer.println("안녕하세요.");
			writer.println("오늘도 힘들게 지나갑니다.");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileWriter writer2 = new FileWriter("myFile2.txt");
		writer2.write("또 하루 지나간다.\r\n");
		writer2.write("또 하루 지나간다2.\r\n");
		writer2.close();
		
	}
}
