package com.oraclejava.exam;

public class Student {
	int id;
	String name;
	int age;
	

	// �⺻������
	public Student() {
		System.out.println("�⺻�������Դϴ�.");
		
		id = 1001;
		name = "ȫ�浿";
		age = 20;
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
		System.out.println("�⺻������2�Դϴ�.");
	}
	
	
	

}
