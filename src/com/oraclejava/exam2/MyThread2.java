package com.oraclejava.exam2;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyThread2 is running.....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 mt1 = new MyThread2();
		
		Thread t1 = new Thread(mt1);
		t1.start();

	}
}
