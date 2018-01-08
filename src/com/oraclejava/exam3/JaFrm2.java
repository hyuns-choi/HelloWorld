package com.oraclejava.exam3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JaFrm2 extends JFrame {
	public JaFrm2(String title) {
		setTitle(title);    // 타이틀
		MyClock mc = new MyClock();
		add(mc);
		mc.start();
		setSize(400, 200);    // 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE);    // 종료버튼 클릭시 완전종료
		setVisible(true);    // 실행시 보이게
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm2 frm = new JaFrm2("시계");

	}
}

class MyClock extends JPanel implements Runnable{

	Thread thread = null;
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
	Date currentDate;
	String time;
	
	public void start() {
		if(thread == null)
		{
			thread = new Thread(this);	// this
			thread.start();
		}
	}
	
	public void stop() {
		thread = null;	// 쓰레드종료
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(thread != null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			repaint(); // 화면갱신
		}
	}
		
	// 그림을 그리는 곳
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		drawSturecture(g); // 화면 클리어
		
		currentDate = new Date();
		time = formatter.format(currentDate);
		g.drawString(time, 150, 80); // 문자열 표시
	}

	private void drawSturecture(Graphics g) {
		// TODO Auto-generated method stub
		g.setFont(new Font("맑은고딕", Font.BOLD, 24)); // 폰트
		g.setColor(Color.orange);
		g.fillOval(0, 0, 380, 160);
		g.setColor(Color.black);
		
	}
}

