package calculator;

import java.awt.*;
import javax.swing.*;

public class calclayout extends JFrame {
	
	JTextArea t;
	double addc=0, subc=0, divc=0, mulc=0, num1=0, num2=0, result=0,count=0;
	public calclayout()
	{
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,4,10,10));
		String[][] names = {
				{"AC","7","8","9","/"},
				{"4","5","6","x"},
				{"1","2","3","-"},
				{"0",".","=","+"}
				};
		t = new JTextArea();
		Font f=new Font("Helvetica",Font.ITALIC,60);
		t.setFont(f);
		t.setSize(1000,1000);
		c.add(t,BorderLayout.NORTH);
		t.setBackground(Color.WHITE);
		t.setOpaque(true);
		for(int i=0;i<names.length;i++)
		{
			for(int j=0;j<names[i].length;j++){
				JButton b=new JButton (names[i][j]);
				p.add(b);
							}
			c.add(p,BorderLayout.CENTER);
			setSize(600,800);
			setVisible(true);
		}
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new calclayout();
	}

}
