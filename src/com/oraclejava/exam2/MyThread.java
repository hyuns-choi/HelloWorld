package com.oraclejava.exam2;

public class MyThread extends Thread {

	public void run() {
		System.out.println("MyThread is running.....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ ����
		MyThread t1 = new MyThread();
		t1.start();
		
		// ���罺����(����)�� ��� ����.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���� ������ ������");
	}

}
