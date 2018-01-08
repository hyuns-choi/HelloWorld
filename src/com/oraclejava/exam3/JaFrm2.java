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
		setTitle(title);    // Ÿ��Ʋ
		MyClock mc = new MyClock();
		add(mc);
		mc.start();
		setSize(400, 200);    // ũ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);    // �����ư Ŭ���� ��������
		setVisible(true);    // ����� ���̰�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm2 frm = new JaFrm2("�ð�");

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
		thread = null;	// ����������
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
			
			repaint(); // ȭ�鰻��
		}
	}
		
	// �׸��� �׸��� ��
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		drawSturecture(g); // ȭ�� Ŭ����
		
		currentDate = new Date();
		time = formatter.format(currentDate);
		g.drawString(time, 150, 80); // ���ڿ� ǥ��
	}

	private void drawSturecture(Graphics g) {
		// TODO Auto-generated method stub
		g.setFont(new Font("�������", Font.BOLD, 24)); // ��Ʈ
		g.setColor(Color.orange);
		g.fillOval(0, 0, 380, 160);
		g.setColor(Color.black);
		
	}
}

