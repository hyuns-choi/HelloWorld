package com.oraclejava.exam;

public class String1 {

	public static void main(String[] args) {
		String s1="Olympic";
		String s2="평창";
		
		System.out.println(s1 + s2);
		
		System.out.println(s1 + s2 + 2 + 0 + 1 + 8);
		
		System.out.println(s1 + s2 + (2 + 0 + 1 + 8));
		
		String s3 = "done";
		String s4 = "i am done";
		
//		System.out.println(s3.equals("done"));
//		System.out.println(s3.equalsIgnoreCase("done"));
//		System.out.println(s4.endsWith("done"));

		StringBuffer sb = new StringBuffer();
		sb.append("Olympic");
		sb.append("2020");
		sb.append("동경");
		
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("유로");
		sb2.append("2020");
		System.out.println(sb2.toString());
		
	}

}
