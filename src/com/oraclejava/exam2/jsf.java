package com.oraclejava.exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jsf {
	
	public static void main(String[] arg) {
		// SET
		
		Set<String> set = new HashSet<>();
		set.add("�̸���");
		set.add("�̽¿�");
		set.add("�̼���");
		set.add("�̸���");
		
		System.out.println(set);
		
		// List
		List<String> list = new ArrayList<>();
		list.add("�ѱ�");
		list.add("����");
		list.add("����");
		list.add("��â");
		list.add("�λ�");
		list.add("����");
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		String city = list.get(1);
		System.out.println(city);
		
		int pos = list.indexOf("�λ�");
		System.out.println("�λ��� ��ġ:" + pos);
		
		// Map
		Map<String, String> map =new HashMap<>();
		map.put("������", "damansa1@naver.com");
		map.put("��1����", "dam1ansa1@naver.com");
		map.put("����2��", "dama2nsa1@naver.com");
		map.put("������3", "daman3sa1@naver.com");
		
		System.out.println(map.get("����2��"));
		
		
		
		
	}

}
