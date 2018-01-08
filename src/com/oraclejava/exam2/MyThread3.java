package com.oraclejava.exam2;

public class MyThread3 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("t1 is running....");
				
			}
		});
		t1.start();
		
		Thread t2 = new Thread(() -> System.out.println("t2 is running"));
		t2.start();
	}
	
}
