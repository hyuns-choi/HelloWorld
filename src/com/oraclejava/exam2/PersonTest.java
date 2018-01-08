package com.oraclejava.exam2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
			new Person("준표", "홍", 65),
			new Person("석희", "손", 55), 
			new Person("재인", "문", 65), 
			new Person("철수", "안", 54), 
			new Person("승민", "유", 58),
			new Person("승엽", "이", 54),
			new Person("만기", "이", 54),
			new Person("회창", "이", 54)
		);
		/*
		//정렬(성순으로)
		Collections.sort(people, new Comparator<Person>() {
				
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		*/
		Collections.sort(people, (Person p1, Person p2) ->
					p1.getLastName().compareTo(p2.getLastName()));
		
		/*
		//정렬(나이순으로)
		Collections.sort(people, new Comparator<Person>() {
				
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				
				return o1.getAge() - o2.getAge();
			}
		});
		*/
		
		// 모든사람 출력
		printAll2(people);
		
		printByCondition(people, new Condition() {
			
			@Override
			public boolean check(Person p) {
				// TODO Auto-generated method stub
				if(p.getLastName().equals("문"))
					return true;
				return false;
			}
		});
		
		printByCondition(people, p -> p.getLastName().equals("안"));
		
	}
	
	public static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
		
	}

	public static void printAll2(List<Person> people) {
		for(Person p : people) {
			if(p.getLastName().equals("이"))
			{
				System.out.println(p);
			}
		}		
	}
	
	public static void printByCondition(List<Person> people, Condition c) {
		for(Person p : people) {
			if(c.check(p))
			{
				System.out.println(p);
			}
		}	
	}
}

interface Condition{
	boolean check(Person p);
}


