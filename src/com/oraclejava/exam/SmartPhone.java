package com.oraclejava.exam;

public class SmartPhone {
	private String phoneName;
	private double phonePrice;	// 출고가
	private double monPrice;	// 단말구매가
	private int monTotal;		// 할부개월
	private double priceRate = 0.0626d;		// 할부수수료 
	private double disPrice;	// 선택약정요금할인
	private double telPrice;	// 월정액
	private double totalPrice;	// 통신요금
	
	public SmartPhone(String phoneName, double phonePrice, int monTotal, double telPrice) {
		super();
		this.phoneName = phoneName;
		this.phonePrice = phonePrice;
		this.monTotal = monTotal;
		this.telPrice = telPrice;
		
		this.monPrice = Math.ceil((phonePrice + (phonePrice * priceRate))/this.monTotal);
		this.disPrice = Math.ceil((telPrice * 0.25)/100)*100;
		this.totalPrice = Math.ceil( this.monPrice + telPrice - disPrice );
	}
	
	public void info()
	{
		System.out.println("폰이름: " + this.phoneName);
		System.out.println("출고가: " + this.phonePrice);
		System.out.println("단말구매가: " + this.monPrice);
		System.out.println("할부개월: " + this.monTotal);
		System.out.println("월정액: " + this.telPrice);
		System.out.println("지원금: " + this.disPrice);
		System.out.println("월 납부금액: " + this.totalPrice);
	}
}
