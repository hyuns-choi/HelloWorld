package com.oraclejava.exam;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numOfStudents;
		System.out.println("학생 수 입력");
		numOfStudents = in.nextInt();
						
		// 키배열(5명의학생)
		double[] heights = new double[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++) {
			System.out.println("키 입력:");
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
		
		System.out.printf("평균키는 %5.2f", dTotal/numOfStudents);
		
		System.out.printf("가장큰키 %5.2f", dMax);
	}
}
