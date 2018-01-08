package com.oraclejava.exam3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JaFrm3 extends JFrame {
	JButton btn;
	JTextField txt;
	JCheckBox cbx;
	
	public JaFrm3(String sTitle) {
		setTitle(sTitle);
		setLayout(null);	//기본 레이아웃 정지
		setSize(250, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txt = new JTextField("");
		txt.setBounds(80, 20, 100, 20);
		add(txt);
		
		setVisible(true);
		
		cbx = new JCheckBox("English");
		cbx.setBounds(80, 60, 80, 20);
		add(cbx);
		
		btn = new JButton("인사");
		//btn.addActionListener(new MyActionListener());
		//익명 클래스
		/*
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cbx.isSelected()) {
					txt.setText("Hello");
				} else {
					txt.setText("안녕하세요.");
				}				
			}
		});
		*/
		// Lamdba식
		btn.addActionListener( e -> {
			if(cbx.isSelected()) {
				txt.setText("Hello");
			} else {
				txt.setText("안녕하세요.");
			}			
		});
		add(btn);
		btn.setBounds(80, 80, 60, 25);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm3 ja = new JaFrm3("오라클자바");
		
	}
	

	// inner class
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// 버튼클릭 시 
			if(cbx.isSelected()) {
				txt.setText("Hello");
			} else {
				txt.setText("안녕하세요.");
			}
		}
	}
}
