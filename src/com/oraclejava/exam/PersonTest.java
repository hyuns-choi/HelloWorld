package com.oraclejava.exam;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person	myInfo = new Person();
//		myInfo.id = 1;
//		myInfo.name = "ȫ�浿";
//		myInfo.age = 22;
//		myInfo.bio = "�ȳ��ϼ��� ���� �ڹ� �ʺ����ϴ�.";
		
		Person myInfo = new Person(1, "ȫ�浿", 22, "�ȳ��ϼ��� ���� �ڹ� �ʺ����ϴ�.");
		
		//System.out.println(myInfo.getId() + "\n"+ myInfo.getName() + "\n"+ myInfo.getAge() + "\n"+ myInfo.getBio());
		System.out.println(myInfo.toString());
		
	}

}
