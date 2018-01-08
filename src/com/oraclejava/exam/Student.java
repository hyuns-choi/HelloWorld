package com.oraclejava.exam;

public class Student {
	int id;
	String name;
	int age;
	

	// 기본생성자
	public Student() {
		System.out.println("기본생성자입니다.");
		
		id = 1001;
		name = "홍길동";
		age = 20;
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
		System.out.println("기본생성자2입니다.");
	}
	
	
	

}
