package com.oraclejava.exam3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JaFrm5 extends JFrame {


	public JaFrm5(String sTitle) {
		setTitle(sTitle);
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//MyPanel pn = new MyPanel();
		//add(pn);				
		// or
		// �����ϰ�..
		//ImageIcon ico = new ImageIcon("Chrysanthemum.jpg");
		//JLabel label = new JLabel(ico);
		//add(label);
		// �����ϰԳ�
		
		setVisible(true);	// ��������
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JaFrm5 frm = new JaFrm5("����Ŭ�ڹ�");
	}
	
	class MyPanel extends JPanel{
	
		Image img = null;
		
		public MyPanel() {
			Toolkit tk = Toolkit.getDefaultToolkit();
			img = tk.getImage("Chrysanthemum.jpg");
		}
		
		// �׸��� �׸��� ��
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 20, 10, this);
		}
	}
}
