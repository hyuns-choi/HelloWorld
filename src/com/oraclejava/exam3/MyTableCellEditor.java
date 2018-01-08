package com.oraclejava.exam3;

import java.awt.Component;

import javax.swing.AbstractCellEditor;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class MyTableCellEditor extends AbstractCellEditor 
	implements TableCellEditor {
	
	protected JComponent comp = null;

	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return comp;
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
		comp = (JComponent)value;
		
		return comp;
	}

}
