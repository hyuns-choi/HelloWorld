package com.oraclejava.exam2;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println("자동차는 시속 " + car.speed + "킬로로 달립니다.");

		car.disp();
		car.price = 300;
		System.out.println("가격: " + car.price);
		
		Vehicle car2 = new Car2();
		car2.disp();
	}

}
