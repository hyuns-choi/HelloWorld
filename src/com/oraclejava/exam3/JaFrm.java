package com.oraclejava.exam3;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JaFrm extends JFrame {
	
	public JaFrm(String title) {
		setTitle(title);    // Ÿ��Ʋ
		MyPanel pn = new MyPanel();	// �г� �߰�
		add(pn);
		setSize(300, 200);    // ũ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);    // �����ư Ŭ���� ��������
		setVisible(true);    // ����� ���̰�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm frm = new JaFrm("����Ŭ�ڹ�");
	}
}

class MyPanel extends JPanel{

	// �׸��� �׸��� ��
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setFont(new Font("�������", Font.ITALIC, 24)); // ��Ʈ
		g.drawString("�ȳ��ϼ���", 10, 30); // ���ڿ� ǥ��
		g.drawOval(10, 50, 200, 40); // Ÿ��ǥ��
		g.drawRect(10, 100, 200, 40); // �簢��ǥ��
	}
}




