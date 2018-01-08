package com.oraclejava.exam3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JaFrm8 extends JFrame {
	
	private static final String[] HEADER = { "국가코드", "국가명", "지역코드" };
	
	public List<Country> countryList(){
		List<Country> cList = new ArrayList<>();

		try {
			// 드라이버로드
			//Class.forName("oracle.jdbc.OracleDriver");
			//jdk1.6이상 생략가능
			
			String url = "jdbc:oracle:thin:@192.168.0.51:1521:xe";
			
			Connection con = DriverManager.getConnection(url, "hr", "hr");
			
			String query = "select * from countries";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			Country	country = null;
			while(rs.next()) {
				//
				country = new Country(rs.getString("country_id"),
						rs.getString("country_name"), rs.getInt("region_id"));
				
				cList.add(country);			
			}
			
			rs.close();			
			con.close();
		}
		catch(Exception e) {
			//System.out.println(e);
			JOptionPane.showMessageDialog(null, e);
		}
		
		return cList;
	}

	public JaFrm8(String sTitle) {
		setTitle(sTitle);
		setBounds(10,10,370,320);
		
		DefaultTableModel tm = new DefaultTableModel(HEADER, 0);
		//JTable jTable = new JTable(tm);
		MyTable jTable = new MyTable(tm);
		
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(350, 270));

		JPanel jPanel = new JPanel();
		jPanel.add(jScrollPane);
		add(jPanel, BorderLayout.CENTER);
		
		List<Country> list = countryList();
		
		Object[] data = new Object[3];
		
		for(Country c : list) {
			data[0] = c.getCountryId();
			data[1] = c.getCountryName();
			data[2] = c.getRegionId();
			
			tm.addRow(data);
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	// 마지막에
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm8 frm = new JaFrm8("Countries");
	}
}
