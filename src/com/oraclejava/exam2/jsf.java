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
		set.add("이만기");
		set.add("이승엽");
		set.add("이순신");
		set.add("이만기");
		
		System.out.println(set);
		
		// List
		List<String> list = new ArrayList<>();
		list.add("한국");
		list.add("동경");
		list.add("강릉");
		list.add("평창");
		list.add("부산");
		list.add("광주");
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		String city = list.get(1);
		System.out.println(city);
		
		int pos = list.indexOf("부산");
		System.out.println("부산의 위치:" + pos);
		
		// Map
		Map<String, String> map =new HashMap<>();
		map.put("임형구", "damansa1@naver.com");
		map.put("임1형구", "dam1ansa1@naver.com");
		map.put("임형2구", "dama2nsa1@naver.com");
		map.put("임형구3", "daman3sa1@naver.com");
		
		System.out.println(map.get("임형2구"));
		
		
		
		
	}

}
