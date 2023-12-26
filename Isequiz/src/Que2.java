package javalab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Que2 extends JFrame implements ActionListener
{
static	int count2;
int num;
	JButton jb1;
	JRadioButton b1,b2,b3,b4;
	ButtonGroup bg;
	int c1;
	public Que2(int c1)
	{
	JLabel jl1= new JLabel("what is the answer2?");
	 b1=new JRadioButton("(A)");
	 b2=new JRadioButton("(B)");
	 b3=new JRadioButton("(C)");
	 b4=new JRadioButton("(D)");
	 jb1=new JButton("Next");
	 jb1.setBounds(260, 260, 100, 30);
	 add(jb1);
	jl1.setBounds(20, 20, 200, 20);
	b1.setBounds(75,50,100,30);
	b2.setBounds(75,100,100,30);
	b3.setBounds(75,150,100,30);
	b4.setBounds(75,200,100,30);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	 bg=new ButtonGroup();
	add(jl1);
	bg.add(b1);
	bg.add(b2);
	bg.add(b3);
	bg.add(b4);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	jb1.addActionListener(this);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	

	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		int count = 0;
		if(e.getSource()==b2)
		{
			 count= this.c1+1;
				System.out.print(c1);
				
		}

		if(e.getSource()==jb1)
		{
			setVisible(false);
			//JOptionPane.showMessageDialog(null, "Your Score is-"+num);
			new Que3(count2);
			
		}
		
	}

}


