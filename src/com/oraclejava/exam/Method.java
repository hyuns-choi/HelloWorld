package com.oraclejava.exam;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		//myMethod();
		//add(5, 10);
		double x,y,z;
		double avg;
		
		Scanner input = new Scanner(System.in);
		System.out.println("3���� ���ڸ� �Է��Ͻÿ�");
		
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();
		
		avg = average(x,y,z);
		System.out.println("����� " + avg);
	}
	
	public static void myMethod() {
		System.out.println("�̰��� ���� ù��° �޼����Դϴ�.");
	}

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double average(double a, double b, double c) {
		return (a+b+c) / 3;
	}
	
}
