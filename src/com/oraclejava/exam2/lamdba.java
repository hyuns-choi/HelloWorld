package com.oraclejava.exam2;

public class lamdba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleLamda dd = (int a) -> {
			return a * 2;
		};
		
		DoubleLamda dd2 = (int a) -> a * 2;
		
		System.out.println(dd.doub(100));
		
		System.out.println(dd2.doub(100));
		
		AddLamda aa = (int a, int b) -> a + b;
		System.out.println(aa.add(100, 200));
		
		//StringLamd ss = (String s) -> s.length();
		StringLamd ss = s -> s.length();
		System.out.println(ss.getLength("111가나"));
		
		StringLamd ss2 = x -> x.length();
		System.out.println(ss2.getLength("111가ddd나"));
		
		print(x -> x.length());
		
		DivLamda d1 = (int a, int b) -> {
			if(b == 0) {
				return 0;
			}
			else {
				return a / b;
			}
		};
		System.out.println(d1.div(800, 200));
	}
	
	public static void print(StringLamd ss) {
		System.out.println(ss.getLength("OracleJava"));
	}
	

	interface DoubleLamda{
		public int doub(int a);
	}
	
	interface AddLamda{
		public int add(int a, int b);
	}
	
	interface StringLamd{
		public int getLength(String s);
	}
	
	interface DivLamda {
		public int div(int a, int b);
	}
	
}
