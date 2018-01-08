package com.oraclejava.exam2;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new LinkedList<>();
		myList.add("금연");
		myList.add("금주");
		myList.add("독서");
		myList.remove(0);
		myList.add(0, "운동");
		
		for(String s : myList) {
			System.out.println(s);
		}
	}
}

