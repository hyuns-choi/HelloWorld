package com.oraclejava.exam2;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank kb = new Kb();
		Bank ok = new Ok();
		Bank sh = new Shinhan();
		
		System.out.println("kb����:" + kb.getRate());
		System.out.println("ok����:" + ok.getRate());
		System.out.println("sh����:" + sh.getRate());
		

	}

}
