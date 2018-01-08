package com.oraclejava.exam;

public class SmartPhone {
	private String phoneName;
	private double phonePrice;	// ���
	private double monPrice;	// �ܸ����Ű�
	private int monTotal;		// �Һΰ���
	private double priceRate = 0.0626d;		// �Һμ����� 
	private double disPrice;	// ���þ����������
	private double telPrice;	// ������
	private double totalPrice;	// ��ſ��
	
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
		System.out.println("���̸�: " + this.phoneName);
		System.out.println("���: " + this.phonePrice);
		System.out.println("�ܸ����Ű�: " + this.monPrice);
		System.out.println("�Һΰ���: " + this.monTotal);
		System.out.println("������: " + this.telPrice);
		System.out.println("������: " + this.disPrice);
		System.out.println("�� ���αݾ�: " + this.totalPrice);
	}
}
