package com.oraclejava.exam;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �Է¹޾� ���������� ���
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int month = scan.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;			
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("�߸��Է�");
			break;
		}
	}
}
