package com.oraclejava.exam;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] dd = new String[9][2];
		dd[0][0] = "����";
		dd[0][1] = "���";
		dd[1][0] = "��õ";
		dd[1][1] = "����";
		dd[2][0] = "û��";
		dd[2][1] = "���";
		dd[3][0] = "ȫ��";
		dd[3][1] = "�泲";
		dd[4][0] = "�ȵ�";
		dd[4][1] = "���";
		dd[5][0] = "â��";
		dd[5][1] = "�泲";
		dd[6][0] = "����";
		dd[6][1] = "����";
		dd[7][0] = "����";
		dd[7][1] = "����";
		dd[8][0] = "����";
		dd[8][1] = "����";
		
		for(int i=0; i<dd.length; i++) {
			//System.out.println(dd[i][0] + "��(��) " + dd[i][1] + "�� ��û�������Դϴ�.");
			StringBuilder sb = new StringBuilder();
			sb.append(dd[i][0]).append("��(��)").append(dd[i][1]).append("�� ��û�������Դϴ�.");
			System.out.println(sb.toString());
		}

	}

}
