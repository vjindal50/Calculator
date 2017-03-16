// author: vaibhav
package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class calc extends JFrame implements ActionListener {
	JTextArea t;
	double addc=0, subc=0, divc=0, mulc=0, num1=0, num2=0, result=0,count=0;
	public calc()
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
				b.addActionListener(this);
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
		 new calc();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		String name=((JButton)e.getSource()).getText();
	//t.setText("");
		if(count==1)
		{
			t.setText("");
			count=0;
		}
		if(name=="1" || name=="2"||name=="3"||name=="4"||name=="5"||name=="6"||name=="7"||name=="8"||name=="9"||name=="0"||name==".")
		{
			t.append(name);
		}
		else if(name=="+")
		{
			num1=Double.valueOf(t.getText());
			t.setText("");
			addc = 1;
			subc = 0;
			divc = 0;
			mulc = 0;	
		}
		else if(name=="-")
		{
			num1=Double.valueOf(t.getText());
			t.setText("");
			addc=0;
			subc=1;
			mulc=0;
			divc=0;
		}
		else if(name=="x")
		{
			num1=Double.valueOf(t.getText());
			t.setText("");
			addc=0;
			subc=0;
			mulc=1;
			divc=0;
		}
		else if(name=="/")
		{
			num1=Double.valueOf(t.getText());
			t.setText("");
			addc=0;
			subc=0;
			mulc=0;
			divc=1;
		}
		else if(name=="AC")
		{
			t.setText("");
		}
		else if(name=="=")
		{
			count=1;
			if(addc==1)
			{
				num2 = Double.valueOf(t.getText());
				result=num1+num2;
				t.setText(result+"");
			}
			if(subc==1)
			{
				num2 = Double.valueOf(t.getText());
				result=num1-num2;
				t.setText(result+"");
			}
			if(divc==1)
			{
				num2 = Double.valueOf(t.getText());
				result=num1/num2;
				t.setText(result+"");
			}
			if(mulc==1)
			{
				num2 = Double.valueOf(t.getText());
				result=num1*num2;
				t.setText(result+"");
			}
		}
	}
}

