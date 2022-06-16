import java.awt.*;  
import javax.swing.JFrame;  
import java.awt.event.*;
import javax.swing.*;

class FactorialFrameMain extends JFrame
{
	FactorialFrameMain()
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
				int i,fact=1;
				for(i=number;i>=1;i--)
				{
					fact=fact*i;
				}
				txfout.setText(""+fact);
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
		FactorialFrameMain mbsm=new FactorialFrameMain();
	}
}