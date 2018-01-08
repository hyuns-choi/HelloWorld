package com.oraclejava.exam3;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JaFrm6 extends JFrame {
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	public JaFrm6(String title) {
		setTitle(title);    // 타이틀
		setLayout(new GridLayout(3, 3));
		setSize(300, 200);    // 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE);    // 종료버튼 클릭시 완전종료
		
		b1 = new JButton("button1"); add(b1);
		b2 = new JButton("button2"); add(b2);
		b3 = new JButton("button3"); add(b3);
		b4 = new JButton("button4"); add(b4);
		b5 = new JButton("button5"); add(b5);
		b6 = new JButton("button6"); add(b6);
		b7 = new JButton("button7"); add(b7);
		b8 = new JButton("button8"); add(b8);
		
		
		setVisible(true);    // 실행시 보이게
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm6 frm = new JaFrm6("오라클자바");
	}
}


