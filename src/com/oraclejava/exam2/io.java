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
			System.out.println("������ �����մϴ�.");
		}
		else {
			System.out.println("������ ���������ʽ��ϴ�.");
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
			writer.println("�ȳ��ϼ���.");
			writer.println("���õ� ����� �������ϴ�.");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileWriter writer2 = new FileWriter("myFile2.txt");
		writer2.write("�� �Ϸ� ��������.\r\n");
		writer2.write("�� �Ϸ� ��������2.\r\n");
		writer2.close();
		
	}
}
