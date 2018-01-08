package com.oraclejava.exam3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class MyTableCellRender2 extends DefaultTableCellRenderer {

	//행높이
	private int rowHeight = 0;
	
	@Override
	public Component getTableCellRendererComponent(
			JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		JComponent comp = (JComponent)value;
		//가장 긴 컴포넌트의 맞춰 행의 높이를 조절
		Dimension dimension = comp.getPreferredSize();
		
		if(rowHeight < dimension.getHeight()) {
			rowHeight = dimension.height;
			table.setRowHeight(rowHeight);
		}
		
		return comp;
	}	
}

