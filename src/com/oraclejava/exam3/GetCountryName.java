package com.oraclejava.exam3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class GetCountryName {
	
	static final String DB_URL = "jdbc:oracle:thin:@192.168.0.51:1521:xe";
	static final String USERNAME = "hr";
	static final String PASSWORD = "hr";
	
	public static void main(String[] args) throws Exception {
						
		Scanner scan = new Scanner(System.in);
				
		GetCountryName obj = new GetCountryName();
		while(true) {
			System.out.print("국가코드입력:");
			String cId = scan.nextLine();
			if("".equals(cId)) {
				break;
			}
			
			obj.getCountryName(cId.toUpperCase());
		}	
	}
	
	private void getCountryName(String countryId) {
		Connection con = null;
		CallableStatement cst = null;
		
		try {
			con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			String plSql = "{call getCountryName(?,?)}";
			
			cst = con.prepareCall(plSql);
			cst.setString(1,  countryId);
			cst.registerOutParameter(2, Types.VARCHAR);
			
			cst.execute();
			
			String countryName = cst.getString(2);
			
			System.out.println("국가명:" + countryName);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(cst != null) {
					cst.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			try {
				if(con != null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}		
	}
}
