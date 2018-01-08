package com.oraclejava.exam;

import java.util.Random;

public class my2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int dice1, dice2;
		for(int i=1; i<100; i++) {
			dice1 = rand.nextInt(6)+1;
			dice2 = rand.nextInt(6)+1;
			
			System.out.println(dice1 + "," + dice2);;
		}		
	}

}
