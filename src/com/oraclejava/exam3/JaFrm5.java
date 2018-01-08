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
		// 간단하게..
		//ImageIcon ico = new ImageIcon("Chrysanthemum.jpg");
		//JLabel label = new JLabel(ico);
		//add(label);
		// 간단하게끝
		
		setVisible(true);	// 마지막에
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JaFrm5 frm = new JaFrm5("오라클자바");
	}
	
	class MyPanel extends JPanel{
	
		Image img = null;
		
		public MyPanel() {
			Toolkit tk = Toolkit.getDefaultToolkit();
			img = tk.getImage("Chrysanthemum.jpg");
		}
		
		// 그림을 그리는 곳
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img, 20, 10, this);
		}
	}
}
