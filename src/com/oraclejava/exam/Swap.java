package com.oraclejava.exam;

public class Swap {
	static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		
		
		Swap.swap(x, y);
		
		System.out.println("x---" + x);
		System.out.println("y---" + y);


	}

}
