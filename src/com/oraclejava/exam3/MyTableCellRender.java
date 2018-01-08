package com.oraclejava.exam3;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class MyTableCellRender extends DefaultTableCellRenderer {

	@Override
	public Component getTableCellRendererComponent(
			JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		System.out.println(
				"row:"+row+",column:"+column+",column:"+column+
				",selected:"+isSelected+",focused:"+hasFocus+
				",value:"+value
				);
		
		// ���������� red��
		if(isSelected) {
			this.setBackground(Color.RED);
		}
		else
		{
			this.setBackground(table.getBackground());
		}
		
		if((row%2) == 0) {
			this.setBackground(Color.BLUE);
		}
		else
		{
			this.setBackground(Color.YELLOW);
		}
		
//		// ��Ŀ�� ���� ���� ��������� ����
//		if(hasFocus) {
//			this.setBackground(Color.YELLOW);
//		}
//		
//		// (1,1)���� �Ķ����� ����
//		if(row==1 && column==1) {
//			this.setBackground(Color.BLUE);
//		}
		
		return this;
	}	
}

