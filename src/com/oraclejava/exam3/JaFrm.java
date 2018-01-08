package com.oraclejava.exam3;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JaFrm extends JFrame {
	
	public JaFrm(String title) {
		setTitle(title);    // 타이틀
		MyPanel pn = new MyPanel();	// 패널 추가
		add(pn);
		setSize(300, 200);    // 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE);    // 종료버튼 클릭시 완전종료
		setVisible(true);    // 실행시 보이게
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm frm = new JaFrm("오라클자바");
	}
}

class MyPanel extends JPanel{

	// 그림을 그리는 곳
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setFont(new Font("맑은고딕", Font.ITALIC, 24)); // 폰트
		g.drawString("안녕하세요", 10, 30); // 문자열 표시
		g.drawOval(10, 50, 200, 40); // 타원표시
		g.drawRect(10, 100, 200, 40); // 사각형표시
	}
}




