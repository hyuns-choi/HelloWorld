package com.oraclejava.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class my3 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf.format(date));
	
		String dStr = String.format("현재시간 : %tc", date);
		System.out.println(dStr);
		//System.out.println(x);
		
		Calendar cal = Calendar.getInstance();
		// 평창올림픽 2018-2-9
		//cal.clear();
		cal.set(2018, 1, 9);
		
		date = new Date(cal.getTimeInMillis());
		
		System.out.println(sdf.format(date));
		
		
	}
}
