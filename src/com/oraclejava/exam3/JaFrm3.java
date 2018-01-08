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
		setLayout(null);	//�⺻ ���̾ƿ� ����
		setSize(250, 160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txt = new JTextField("");
		txt.setBounds(80, 20, 100, 20);
		add(txt);
		
		setVisible(true);
		
		cbx = new JCheckBox("English");
		cbx.setBounds(80, 60, 80, 20);
		add(cbx);
		
		btn = new JButton("�λ�");
		//btn.addActionListener(new MyActionListener());
		//�͸� Ŭ����
		/*
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cbx.isSelected()) {
					txt.setText("Hello");
				} else {
					txt.setText("�ȳ��ϼ���.");
				}				
			}
		});
		*/
		// Lamdba��
		btn.addActionListener( e -> {
			if(cbx.isSelected()) {
				txt.setText("Hello");
			} else {
				txt.setText("�ȳ��ϼ���.");
			}			
		});
		add(btn);
		btn.setBounds(80, 80, 60, 25);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm3 ja = new JaFrm3("����Ŭ�ڹ�");
		
	}
	

	// inner class
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// ��ưŬ�� �� 
			if(cbx.isSelected()) {
				txt.setText("Hello");
			} else {
				txt.setText("�ȳ��ϼ���.");
			}
		}
	}
}
