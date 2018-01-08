package com.oraclejava.exam3;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JaFrm4 extends JFrame {

	JTextField txt;
	JComboBox<String> cbox;
	String[] items = {"한국", "미국", "일본"};

	public JaFrm4(String sTitle) {
		setTitle(sTitle);
		setSize(250, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		txt = new JTextField("");
		add(txt, BorderLayout.NORTH);	// 가로 max
		
		cbox = new JComboBox<>(items);
		add(cbox, BorderLayout.SOUTH);
		
		cbox.addActionListener(e -> {
			String s = (String)cbox.getSelectedItem();
			if(s.equals("한국")) {
				txt.setText("안녕하세요.");
			}
			else if(s.equals("미국")) {
				txt.setText("Hello");
			}else {
				txt.setText("고니찌와");
			}
		});
		
		setVisible(true);	// 마지막에
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JaFrm4 frm = new JaFrm4("인사");
	}
}
