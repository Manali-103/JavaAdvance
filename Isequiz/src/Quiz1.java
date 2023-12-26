package javalab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Quiz1 extends JFrame implements ActionListener {

	static int count=0;
	public Quiz1()
	{
		   setTitle("Login Page");
	       setSize(500,300);
	       setLayout(null);
	       JLabel lb7= new JLabel("Username -");
	       lb7.setBounds(85,85, 105, 20);
	       add(lb7);
	       JTextField t4=new JTextField();
	       t4.setBounds(180, 85, 105, 25);
	       add(t4);
	       JLabel lb8= new JLabel("Passward -");
	       lb8.setBounds(80,120, 100, 15);
	       add(lb8);
	       JPasswordField pass= new JPasswordField();
	       pass.setBounds(175, 120, 100, 20);
	       add(pass);
	       JButton btn1=new JButton("Login"); 
	       btn1.setBounds(130,160, 80, 30);
	       add(btn1);
	       btn1.addActionListener(this);
	       setVisible(true);
	       
	}
	
	public static void main(String[] args) {
		Quiz1 q1 = new Quiz1(); 

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new Que1(count);
		
	}

}


