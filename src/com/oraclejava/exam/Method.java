package com.oraclejava.exam;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		//myMethod();
		//add(5, 10);
		double x,y,z;
		double avg;
		
		Scanner input = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하시오");
		
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();
		
		avg = average(x,y,z);
		System.out.println("평균은 " + avg);
	}
	
	public static void myMethod() {
		System.out.println("이것은 나의 첫번째 메서드입니다.");
	}

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double average(double a, double b, double c) {
		return (a+b+c) / 3;
	}
	
}
