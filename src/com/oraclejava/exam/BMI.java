package com.oraclejava.exam;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하세요.");
		float fHeight = scan.nextFloat();
		System.out.println("몸무게를 입력하세요.");
		float fWeight = scan.nextFloat();
		
		float fStandHeight = fHeight / 100f * 2f * 22f;
		float fBMI = fWeight / (fHeight / 100f * 2f);
			
		String sBMI;
		if(fBMI <= 18.5f)
		{
			sBMI = "저체중";
		}
		else if(fBMI >= 18.5f && fBMI <= 25f)
		{
			sBMI = "정상";
		}
		else if(fBMI >= 25f && fBMI <= 30f)
		{
			sBMI = "비만";
		}
		else
		{
			sBMI = "고도비만";
		}
		
		fStandHeight = Math.round(fStandHeight);
		System.out.println("표준체중:" + fStandHeight);

		System.out.println("체질량지수:"+sBMI);
		
	}
}
