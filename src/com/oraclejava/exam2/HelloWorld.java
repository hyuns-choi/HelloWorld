package com.oraclejava.exam2;

public class HelloWorld {
	public void hello(Greeting greet) {
		greet.perform();
	}
	
	public static void main(String[] arg) {
//		HelloWorld hw = new HelloWorld();
//		Greeting kg = new koreaGreeting();
//		hw.hello(kg);
//		 kg = new ChinaGreeting();
//		 hw.hello(kg);
//		 kg = new JapanGreeting();
//		 hw.hello(kg);
//		
		Greeting greet = new Greeting() {
			public void perform() {
				System.out.println("�ȳ��ϼ���");
			}
		};
		
		MyLamdba greet1 = () -> System.out.println("���Ͽ�.");
		greet1.hello();
		 
		 MyLamdba my = () -> System.out.println("�ȳ��ϼ���.");
		 my.hello();
		 
	}
	
	interface MyLamdba{
		void hello();
	}

}
