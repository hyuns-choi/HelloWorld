package com.oraclejava.exam3;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcTest {
	
	public static void main(String[] args) {
		try {
			// 드라이버로드
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.51:1521:xe";
			
			Connection con = DriverManager.getConnection(url, "hr", "hr");
			
			String query = "select * from countries";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString("country_id") + "," + rs.getString("country_name")+
						","+rs.getInt("region_id"));
			}
			
			rs.close();			
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
