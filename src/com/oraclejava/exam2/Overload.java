package com.oraclejava.exam2;

public class Overload {
	
	public static void main(String[] args) {
		
		System.out.println(avg(3,4,6));
		System.out.println(avg(3.1,4.5,6.552));
		
	}
	
	public static double avg(int x, int y, int z) {
		return (x+y+z) / 3.0;
	}
	
	public static double avg(double x, double y, double z) {
		return (x+y+z) / 3;
	}
	
}

