package com.oraclejava.exam;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfStudents;
		System.out.println("�л� �� �Է�");
		numOfStudents = in.nextInt();
						
		// Ű�迭(5�����л�)
		double[] heights = new double[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++) {
			System.out.println("Ű �Է�:");
			heights[i] = in.nextDouble();
		}
		
		double dTotal = 0;
		double dMax = 0;
		for(int i=0; i<heights.length; i++)
		{
			dTotal += heights[i];
			
			if(dMax < heights[i]) {
				dMax = heights[i];
			}				
		}
		
		System.out.printf("���Ű�� %5.2f", dTotal/numOfStudents);
		
		System.out.printf("����ūŰ %5.2f", dMax);
	}
}
