package com.oraclejava.exam2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
	public static void main(String arg[]) {
		List<String> cart = new ArrayList<>();
		cart.add("a");
		cart.add("b");
		cart.add("c");
		cart.add("d");
		cart.add("e");
		cart.add("f");
		
		Iterator<String> it = cart.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
	}
}
