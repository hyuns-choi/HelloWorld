package com.oraclejava.exam;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���.");
		float fHeight = scan.nextFloat();
		System.out.println("�����Ը� �Է��ϼ���.");
		float fWeight = scan.nextFloat();
		
		float fStandHeight = fHeight / 100f * 2f * 22f;
		float fBMI = fWeight / (fHeight / 100f * 2f);
			
		String sBMI;
		if(fBMI <= 18.5f)
		{
			sBMI = "��ü��";
		}
		else if(fBMI >= 18.5f && fBMI <= 25f)
		{
			sBMI = "����";
		}
		else if(fBMI >= 25f && fBMI <= 30f)
		{
			sBMI = "��";
		}
		else
		{
			sBMI = "����";
		}
		
		fStandHeight = Math.round(fStandHeight);
		System.out.println("ǥ��ü��:" + fStandHeight);

		System.out.println("ü��������:"+sBMI);
		
	}
}
