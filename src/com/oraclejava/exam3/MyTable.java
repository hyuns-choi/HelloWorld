package com.oraclejava.exam3;

import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class MyTable extends JTable {
	
	public MyTable(DefaultTableModel tm) {
		super(tm);
	}
	
	MyTableCellRender render1 = new MyTableCellRender();	// 
	MyTableCellRender2 render2 = new MyTableCellRender2();	// 이미지등
	MyTableCellEditor editor1 = new MyTableCellEditor();
	
		
	
	@Override
	public TableCellEditor getCellEditor(int row, int column) {
		// TODO Auto-generated method stub
		//return super.getCellEditor(row, column);		
		TableCellEditor editor;
		
		Object obj = this.getValueAt(row, column);
		if(obj instanceof JComponent) {
			editor = editor1;
		}
		else {
			editor = super.getCellEditor(row, column);
		}
		return editor;
	}


	@Override
	public TableCellRenderer getCellRenderer(int row, int column) {
		// TODO Auto-generated method stub
		//return super.getCellRenderer(row, column);
		TableCellRenderer render;
		
		Object obj = this.getValueAt(row, column);
		if(obj instanceof JComponent) {
			render = render2;
		}
		else {
			render = render1;
		}
		
		return render;
	}
}
