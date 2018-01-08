package com.oraclejava.exam2;

public class my2 {
	public static void main(String[] arg) {
		
		int[] n = new int[5];
		
		
		try {
			int a = 100 / 0;
			n[10] = 100;
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누시면 안됩니다.\n" + e.toString());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의한계를 넘어섰습니다.\n" + e.toString());
		}
		finally {
			System.out.println("최종처리....");
		}
		
		
		System.out.println("기타처리");
		System.out.println("===========");
	}

}
