package com.oraclejava.exam3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class procedure {
	
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.51:1521:xe","hr","hr");
		
		CallableStatement cst = con.prepareCall("{call getTestData(?,?)}");
		
		// 1 base
		cst.registerOutParameter(2, Types.INTEGER);
		
		cst.setInt(1, 20);
		
		cst.execute();
				
		int res = cst.getInt(2);
		
		System.out.println("°á°ú:" + res);
		
		cst.close();
		con.close();
	}

}
