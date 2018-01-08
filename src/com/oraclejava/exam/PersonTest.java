package com.oraclejava.exam;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person	myInfo = new Person();
//		myInfo.id = 1;
//		myInfo.name = "홍길동";
//		myInfo.age = 22;
//		myInfo.bio = "안녕하세요 저는 자바 초보랍니다.";
		
		Person myInfo = new Person(1, "홍길동", 22, "안녕하세요 저는 자바 초보랍니다.");
		
		//System.out.println(myInfo.getId() + "\n"+ myInfo.getName() + "\n"+ myInfo.getAge() + "\n"+ myInfo.getBio());
		System.out.println(myInfo.toString());
		
	}

}
