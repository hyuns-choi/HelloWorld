package com.oraclejava.exam3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JaFrmTest extends JFrame {
	
	JComboBox<String> cbox;
	String[] items = {"국화", "사막", "수국", "해파리"};
	Toolkit tk = Toolkit.getDefaultToolkit();

	public JaFrmTest(String sTitle) {
		setTitle(sTitle);
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		cbox = new JComboBox<>(items);
		add(cbox, BorderLayout.NORTH);
		
		MyPanel pn = new MyPanel();
		add(pn);
		
		pn.img = tk.getImage("Chrysanthemum.jpg");

		cbox.addActionListener(e -> {
			String s = (String)cbox.getSelectedItem();
			if(s.equals("국화")) {
				pn.img = tk.getImage("Chrysanthemum.jpg");
			}
			else if(s.equals("사막")) {
				pn.img = tk.getImage("Desert.jpg");
			}
			else if(s.equals("수국")) {
				pn.img = tk.getImage("Hydrangeas.jpg");
			}
			else if(s.equals("해파리")) {
				pn.img = tk.getImage("Jellyfish.jpg");
			}
			else {
				pn.img = tk.getImage("Chrysanthemum.jpg");
			}
			repaint(); // 화면갱신
		});
		
		setVisible(true);	// 마지막에
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JaFrmTest frm = new JaFrmTest("이미지선택");
	}
	
	class MyPanel extends JPanel{
		
		Image img = null;
		
		public MyPanel() {
			
		}
		
		// 그림을 그리는 곳
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			if(img != null)
			{
				g.drawImage(img, 0, 10, this);				
			}
		}
	}
}
