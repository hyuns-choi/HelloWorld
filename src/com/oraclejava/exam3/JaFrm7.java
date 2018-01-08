package com.oraclejava.exam3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JaFrm7 extends JFrame {

	private static final String[] HEADER = { "이름", "생년월일", "성별" };

	public JaFrm7(String sTitle) {
		setTitle(sTitle);
		setBounds(10,10,370,120);
		
		DefaultTableModel tm = new DefaultTableModel(HEADER, 0/*row count*/);
			
		JTable jTable = new JTable(tm);
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(350, 70));
		
		JPanel jPanel = new JPanel();
		jPanel.add(jScrollPane);
		add(jPanel, BorderLayout.CENTER);
		
		Object[][] data = {
				{"홍길순", "19520202", "Female",},
				{"홍길동", "19530124", "male", },
				{"홍길찬", "19620226", "male", },
				{"홍길영", "19541205", "Female", },
				{"홍길선", "19651152", "Female", },
		};
		
				
		// 행추가
		for(int i=0; i<data.length; i++) {
			tm.addRow(data[i]);
		}
		
				
		// 열추가
		tm.addColumn("나이(만)");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		int nToday = Integer.parseInt(sdf.format(date));
		
		for(int i=0;i<data.length;i++) {
			String sYMD = (String)tm.getValueAt(i,1);
			int nYmd = Integer.parseInt(sYMD);
			
			int nYear = (nToday - nYmd) / 10000;
						
			tm.setValueAt(nYear, i, 3);
		}
					
		
		jTable.setDefaultRenderer(Object.class, new MyTableCellRender());
						
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		setVisible(true);	// 마지막에
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm7 frm = new JaFrm7("JTable");

	}
}
