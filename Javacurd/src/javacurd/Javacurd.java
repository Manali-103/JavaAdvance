package javacurd;

import java.awt.EventQueue;


import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Javacurd {

	private JFrame frame;
	private JTextField txtedition;
	private JTextField txtbname;
	private JTextField txtprice;
	private JTable table;
	private JTable table_1;
	private JTextField txtbid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javacurd window = new Javacurd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Javacurd() {
		initialize();
		Connect();
	    table_load();
	}

	/**
	 * Initialize the contents of the frame.
	 **/
	Connection con;
	 PreparedStatement pst;
	 ResultSet rs;
	 
	 public void Connect()
	     {
	         try {
	             Class.forName("com.mysql.jdbc.Driver");
	             con = DriverManager.getConnection("jdbc:mysql://localhost/javacurd", "root","");
	         }
	         catch (ClassNotFoundException ex) 
	         {
	           ex.printStackTrace();
	         }
	         catch (SQLException ex) 
	         {
	         	   ex.printStackTrace();
	         }
	 
	     }
	 public void table_load()
     {
      try 
      {
     pst = con.prepareStatement("select * from book");
     rs = pst.executeQuery();
     table.setModel(DbUtils.resultSetToTableModel(rs));
 } 
      catch (SQLException e) 
      {
      e.printStackTrace();
   } 
     }
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.setBounds(100, 100, 1059, 764);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setBounds(407, 21, 176, 56);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 122, 444, 261);
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(239, 20, 1, 1);
		panel.add(desktopPane);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 55, 92, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edition");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 121, 92, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(10, 190, 92, 29);
		panel.add(lblNewLabel_1_1_1);
		
		txtedition = new JTextField();
		txtedition.setBounds(135, 123, 266, 29);
		panel.add(txtedition);
		txtedition.setColumns(10);
		
		txtbname = new JTextField();
		txtbname.setColumns(10);
		txtbname.setBounds(135, 57, 266, 29);
		panel.add(txtbname);
		
		txtprice = new JTextField();
		txtprice.setColumns(10);
		txtprice.setBounds(135, 192, 266, 29);
		panel.add(txtprice);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) 
				{ 
					String bname,edition,price;
					 bname = txtbname.getText();
					 edition = txtedition.getText();
					 price = txtprice.getText();
					 
					 try {
					 pst = con.prepareStatement("insert into book(Name,Edition,Price)values(?,?,?)");
					 pst.setString(1, bname);
					 pst.setString(2, edition);
					 pst.setString(3, price);
					 pst.executeUpdate();
					 JOptionPane.showMessageDialog(null, "Record Addedddd!!!!!");
					 table_load();
					            
					             txtbname.setText("");
					             txtedition.setText("");
					             txtprice.setText("");
					             txtbname.requestFocus();
					 
					    }
					 
					 catch (SQLException e1) 
					        {
					 
					 e1.printStackTrace();
					 }
				}
		});
		btnNewButton.setBounds(26, 427, 97, 56);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(181, 427, 97, 56);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtbname.setText("");
				 txtedition.setText("");
				 txtprice.setText("");
				 txtbname.requestFocus();
				
				
			}
		});
		btnNewButton_1_1.setBounds(324, 427, 97, 56);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btnNewButton_1_1);
		
		table = new JTable();
		table.setBounds(538, 186, 45, -40);
		frame.getContentPane().add(table);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(474, 122, 537, 361);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 519, 460, 117);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Book ID");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(22, 41, 92, 29);
		panel_1.add(lblNewLabel_1_1_2);
		
		txtbid = new JTextField();
		txtbid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
					 
					 try {
					           
					             String id = txtbid.getText();
					 
					                 pst = con.prepareStatement("select name,edition,price from book where id = ?");
					                 pst.setString(1, id);
					                 ResultSet rs = pst.executeQuery();
					 
					             if(rs.next()==true)
					             {
					               
					                 String name = rs.getString(1);
					                 String edition = rs.getString(2);
					                 String price = rs.getString(3);
					                 
					                 txtbname.setText(name);
					                 txtedition.setText(edition);
					                 txtprice.setText(price);
					                 
					                 
					             }   
					             else
					             {
					              txtbname.setText("");
					              txtedition.setText("");
					                 txtprice.setText("");
					                  
					             }
					             
					 
					 
					         } 
					 
					 catch (SQLException ex) {
					            
					         }
					 
					 
					 
					 
					 }
				
				
				
				
			
		});
		txtbid.setColumns(10);
		txtbid.setBounds(137, 41, 266, 29);
		panel_1.add(txtbid);
		
		JButton btnNewButton_1_1_1 = new JButton("Update");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
					 String bname,edition,price,bid;
					 
					 
			         bname = txtbname.getText();
					 edition = txtedition.getText();
					 price = txtprice.getText();
					 bid  = txtbid.getText();
					 
					 try {
					 pst = con.prepareStatement("update book set name= ?,edition=?,price=? where id =?");
					 pst.setString(1, bname);
					             pst.setString(2, edition);
					             pst.setString(3, price);
					             pst.setString(4, bid);
					             pst.executeUpdate();
					             JOptionPane.showMessageDialog(null, "Record Update!!!!!");
					             table_load();
					            
					             txtbname.setText("");
					             txtedition.setText("");
					             txtprice.setText("");
					             txtbname.requestFocus();
					 }
					 
					             catch (SQLException e1) {
					 
					 e1.printStackTrace();
					 }
					 
					 
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1.setBounds(507, 526, 144, 69);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bid;
				 bid  = txtbid.getText();
				 
				 try {
				 pst = con.prepareStatement("delete from book where id =?");
				 
				             pst.setString(1, bid);
				             pst.executeUpdate();
				             JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
				             table_load();
				            
				             txtbname.setText("");
				             txtedition.setText("");
				             txtprice.setText("");
				             txtbname.requestFocus();
				 }
				 
				             catch (SQLException e1) {
				 
				 e1.printStackTrace();
				 }
				
				
				
				
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1_1.setBounds(661, 526, 148, 69);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
	}
}
