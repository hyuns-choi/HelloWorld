package com.oraclejava.exam2;

public class MyCal extends Calculator {
	public void multi(int x, int y) {
		r = x * y;
		System.out.println("곱은 " + r);
	}
	
	public void divide(int x, int y) {
		if(y == 0) {
			r = 0;
		}
		else {
			r = x / y;
		}
		
		System.out.println("나누기는 " + r);
	}
}
