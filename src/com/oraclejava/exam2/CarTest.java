package com.oraclejava.exam2;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println("�ڵ����� �ü� " + car.speed + "ų�η� �޸��ϴ�.");

		car.disp();
		car.price = 300;
		System.out.println("����: " + car.price);
		
		Vehicle car2 = new Car2();
		car2.disp();
	}

}
