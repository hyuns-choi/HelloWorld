package com.oraclejava.exam;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 이름:");
		String name = scan.nextLine();
		
		System.out.println("당신의 나이");
		int age = scan.nextInt();
		System.out.println(name);
		System.out.println(age);

	}

}
