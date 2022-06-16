/*Write a swing frame code to check whether the number entered in the text box is multiple of 7 or not*/
import java.awt.*;  
import javax.swing.JFrame;  
import java.awt.event.*;
import javax.swing.*;

class MultipleBySevenMain extends JFrame
{
	MultipleBySevenMain()
	{
		JLabel lblnum,lbloutput;
		JTextField txfnum,txfout;
		JButton btncalc;
		setSize(1570,840);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//labels
		lblnum=new JLabel("Enter Number : ");
		lblnum.setBounds(200,200,500,70);
		add(lblnum);
		lbloutput=new JLabel("Output : ");
		lbloutput.setBounds(200,400,500,70);
		add(lbloutput);

		//textfields
		txfnum=new JTextField();
		txfnum.setBounds(750,200,500,70);
		add(txfnum);
		txfout=new JTextField();
		txfout.setBounds(750,400,500,70);
		add(txfout);
		txfout.setEditable(false);

		//buttons
		btncalc=new JButton("Calculate");
		btncalc.setBounds(600,600,200,70);
		add(btncalc);

		btncalc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String strnum=txfnum.getText();
				int number=Integer.parseInt(strnum);
				if(number%7==0)
				{
					txfout.setText(number+" is Multiple of 7");
				}
				else
				{
					txfout.setText(number+" is not Multiple of 7");
				}
			}
		});

		//visible
		setVisible(true);
		lblnum.setVisible(true);
		lbloutput.setVisible(true);
		txfout.setVisible(true);
		txfnum.setVisible(true);
		btncalc.setVisible(true);


	}
	public static void main(String args[])
	{
		MultipleBySevenMain mbsm=new MultipleBySevenMain();
	}
}