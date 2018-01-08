package com.oraclejava.exam3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class JaFrm71 extends JFrame {

	private static final String[] HEADER = { "�̸�", "�������", "����" };
	
	public JaFrm71(String sTitle) {
		setTitle(sTitle);
		setBounds(10,10,370,800);
		
		DefaultTableModel tm = new DefaultTableModel(HEADER, 0/*row count*/);
			
		MyTable jTable = new MyTable(tm);
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(350, 700));
		
		JPanel jPanel = new JPanel();
		jPanel.add(jScrollPane);
		add(jPanel, BorderLayout.CENTER);
		
		Object[][] data = {
				{"ȫ���", "19520202", "Female",},
				{"ȫ�浿", "19530124", "male", },
				{"ȫ����", "19620226", "male", },
				{"ȫ�濵", "19541205", "Female", },
				{"ȫ�漱", "19651152", "Female", },
		};
		
				
		// ���߰�
		for(int i=0; i<data.length; i++) {
			tm.addRow(data[i]);
		}
		
				
		// ���߰�
		tm.addColumn("����");
		
		ImageIcon ico = new ImageIcon("moon.jpg");
		JLabel label = new JLabel(ico);
		
		tm.setValueAt(label, 0, 3);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		setVisible(true);	// ��������
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm71 frm = new JaFrm71("JTable");

	}
}
