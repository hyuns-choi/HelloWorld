package com.oraclejava.exam3;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JaFrm4 extends JFrame {

	JTextField txt;
	JComboBox<String> cbox;
	String[] items = {"�ѱ�", "�̱�", "�Ϻ�"};

	public JaFrm4(String sTitle) {
		setTitle(sTitle);
		setSize(250, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		txt = new JTextField("");
		add(txt, BorderLayout.NORTH);	// ���� max
		
		cbox = new JComboBox<>(items);
		add(cbox, BorderLayout.SOUTH);
		
		cbox.addActionListener(e -> {
			String s = (String)cbox.getSelectedItem();
			if(s.equals("�ѱ�")) {
				txt.setText("�ȳ��ϼ���.");
			}
			else if(s.equals("�̱�")) {
				txt.setText("Hello");
			}else {
				txt.setText("������");
			}
		});
		
		setVisible(true);	// ��������
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JaFrm4 frm = new JaFrm4("�λ�");
	}
}
