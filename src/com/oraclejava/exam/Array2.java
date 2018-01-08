package com.oraclejava.exam;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] dd = new String[9][2];
		dd[0][0] = "수원";
		dd[0][1] = "경기";
		dd[1][0] = "춘천";
		dd[1][1] = "강원";
		dd[2][0] = "청주";
		dd[2][1] = "충북";
		dd[3][0] = "홍성";
		dd[3][1] = "충남";
		dd[4][0] = "안동";
		dd[4][1] = "경북";
		dd[5][0] = "창원";
		dd[5][1] = "경남";
		dd[6][0] = "전주";
		dd[6][1] = "전북";
		dd[7][0] = "무안";
		dd[7][1] = "전남";
		dd[8][0] = "제주";
		dd[8][1] = "제주";
		
		for(int i=0; i<dd.length; i++) {
			//System.out.println(dd[i][0] + "은(는) " + dd[i][1] + "의 도청소재지입니다.");
			StringBuilder sb = new StringBuilder();
			sb.append(dd[i][0]).append("은(는)").append(dd[i][1]).append("의 도청소재지입니다.");
			System.out.println(sb.toString());
		}

	}

}
