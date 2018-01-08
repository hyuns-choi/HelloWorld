package com.oraclejava.exam3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JaFrm9 extends JFrame {
	
	private JLabel lbl1, lbl2, lbl3, lbl4;
	private JTextField txtId, txtFirstName, txtLastName, txtAge;
	private JPanel leftPanel, rightPanel, panel1, panel2;
	private JButton btnInsert, btnUpdate, btnDelete;
	private JTable jTableUsers;
	private JScrollPane jScrollPan;
	
	public Connection getConnection() {
		Connection con;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.51:1521:xe","hr","hr");
			return con;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public void executeSqlQuery(String query, String message) {
		Connection con = getConnection();
		Statement st;
		try {
			st = con.createStatement();
			if(st.executeUpdate(query) == 1) {
				// 성공
				// jtable 리프레쉬
				//DefaultTableModel tm = (DefaultTableModel)jTableUsers.getModel();
				//tm.setRowCount(0);
				showUsersJtable();
				
				JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
			}
			else{
				JOptionPane.showMessageDialog(null, "Data not " + message);				
			}
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//JOptionPane.showMessageDialog(null, e);
		}		 
	}
	
	public List<User> getUserList(){
		List<User> usersList = new ArrayList<>();
		Connection con = getConnection();
		
		String query = "select * from users order by Id";
		Statement st;
		ResultSet rs;
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				User user = new User(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4));
				usersList.add(user);
			}			
			
			rs.close();
			con.close();
			
			return usersList;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	// JTable에 데이터 보여주기
	public void showUsersJtable() {

		List<User> list = getUserList();
		DefaultTableModel tm = (DefaultTableModel)jTableUsers.getModel();
		
		tm.setNumRows(0);
		
		Object[] data = new Object[4];		
		
		for(User c : list) {
			data[0] = c.getId();
			data[1] = c.getFirstName();
			data[2] = c.getLastName();
			data[3] = c.getAge();
			
			tm.addRow(data);
		}		
	}
	
	public JaFrm9(String title) {
		setTitle(title);    // 타이틀
		
		setLayout(new GridLayout(1, 2));
		
		
		leftPanel = new JPanel(); add(leftPanel);
		rightPanel = new JPanel(); add(rightPanel);
		
		jTableUsers = new JTable(); rightPanel.add(jTableUsers);
		jTableUsers.setModel(new DefaultTableModel(new String[] {
				"Id", "First Name", "Last Name", "Age" 
		},0));
				
		JScrollPane jScrollPane = new JScrollPane(jTableUsers);
		jScrollPane.setPreferredSize(new Dimension(300, 250));
		
		rightPanel.add(jScrollPane);
				
//		JPanel jPanel = new JPanel();
//		jPanel.add(jScrollPane);
//		rightPanel.add(jPanel, BorderLayout.CENTER);
		
		
		leftPanel.setLayout(new GridLayout(2, 1));
		panel1 = new JPanel(); leftPanel.add(panel1);
		panel2 = new JPanel(); leftPanel.add(panel2);
				
		panel1.setLayout(new GridLayout(4, 2, 10, 10));	// 패널1
		lbl1 = new JLabel("Id"); panel1.add(lbl1);
		txtId = new JTextField(""); panel1.add(txtId);
		lbl2 = new JLabel("First Name"); panel1.add(lbl2);
		txtFirstName = new JTextField(""); panel1.add(txtFirstName);
		lbl3 = new JLabel("Last Name"); panel1.add(lbl3);
		txtLastName = new JTextField(""); panel1.add(txtLastName);
		lbl4 = new JLabel("Age"); panel1.add(lbl4);
		txtAge = new JTextField(""); panel1.add(txtAge);
						
		panel2.setLayout(new GridLayout(1, 3));	// 패널2
		btnInsert = new JButton("Insert"); panel2.add(btnInsert);
		btnUpdate = new JButton("Update"); panel2.add(btnUpdate);
		btnDelete = new JButton("Delete"); panel2.add(btnDelete);
		
		btnInsert.addActionListener(e -> {
			String query = "INSERT INTO users(id, firstname, lastname, age) values ("+
		"users_seq.nextval, '"+ txtFirstName.getText() + "', '" +
					txtLastName.getText() + "', "+txtAge.getText() + ")";
			executeSqlQuery(query, "Inserted");
			
		});
		
		btnUpdate.addActionListener(e -> {
			String query = "UPDATE users SET firstname='" + txtFirstName.getText() + "', lastname='" +
					txtLastName.getText() + "', age="+txtAge.getText() + " where id='" + txtId.getText() + "'";
			
			executeSqlQuery(query, "UpDated");
		});
		
		btnDelete.addActionListener(e -> {
			String query = "DELETE FROM users where id='" + txtId.getText() + "'";
			
			executeSqlQuery(query, "UpDated");
		});
		
		
		jTableUsers.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseClicked(e);
				// 선택한 행의 인덱스
				int i = jTableUsers.getSelectedRow();
				TableModel model = jTableUsers.getModel();
				
				txtId.setText(model.getValueAt(i, 0).toString());
				txtLastName.setText(model.getValueAt(i, 1).toString());
				txtFirstName.setText(model.getValueAt(i, 2).toString());
				txtAge.setText(model.getValueAt(i,	3).toString());
				
			}			
		});
		
		showUsersJtable();		
				
		setSize(700, 360);    // 크기
		setDefaultCloseOperation(EXIT_ON_CLOSE);    // 종료버튼 클릭시 완전종료
		setVisible(true);    // 실행시 보이게
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaFrm9 frm = new JaFrm9("오라클자바");
	}
}
