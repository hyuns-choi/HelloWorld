package com.oraclejava.exam2;

public class my2 {
	public static void main(String[] arg) {
		
		int[] n = new int[5];
		
		
		try {
			int a = 100 / 0;
			n[10] = 100;
		}catch (ArithmeticException e) {
			System.out.println("0���� �����ø� �ȵ˴ϴ�.\n" + e.toString());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���Ѱ踦 �Ѿ���ϴ�.\n" + e.toString());
		}
		finally {
			System.out.println("����ó��....");
		}
		
		
		System.out.println("��Ÿó��");
		System.out.println("===========");
	}

}
