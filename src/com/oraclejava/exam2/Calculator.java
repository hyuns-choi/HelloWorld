package com.oraclejava.exam2;

public class Calculator {
	int r;
	public void add(int x, int y)	{
		r = x + y;
		System.out.println("합은 " + r);
	}
	
	public void minus(int x, int y) {
		r = x - y;
		System.out.println("차는 " + r);
	}

}
