package com.oraclejava.exam;

public class Person {
	//id, �̸�, ����, �Ұ�
	private int id;
	private String name;
	private int age;
	private String bio;

	public Person(int id, String name, int age, String bio) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.bio = bio;
	}
	
	public String toString() {
		return "id:" + id + "\n�̸�:" + name + "\n����:" + age + "\n�Ұ�:" + bio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
	
	
}
