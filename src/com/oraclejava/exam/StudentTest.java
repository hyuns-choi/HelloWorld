package com.oraclejava.exam;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student	st = new Student();
		Student	st1 = new Student(1, "гогого", 50);
		
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.age);
		
		System.out.println(st1.id);
		System.out.println(st1.name);
		System.out.println(st1.age);
		
		

	}

}
