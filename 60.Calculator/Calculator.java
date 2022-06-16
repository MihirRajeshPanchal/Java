import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener,WindowListener
{
	Label num1,num2,result;
	TextField tnum1,tnum2,tresult;
	Button add,sub,mul,div,reset;

	Calculator(String title)
	{
		//callthe superclass constructor
		super(title);//This will set the title of frame can be done be setTitle() also
		setLayout(new FlowLayout());
		num1=new Label("Number 1 : ");
		add(num1);
		tnum1=new TextField(70);
		add(tnum1);
		num2=new Label("Number 2 : ");
		add(num2);
		tnum2=new TextField(70);
		add(tnum2);
		result=new Label("Result : ");
		add(result);
		tresult= new TextField(70);
		add(tresult);
		tresult.setEditable(false);
		add= new Button("Addition");
		add(add);
		add.addActionListener(this);
		sub= new Button("Subraction");
		add(sub);
		sub.addActionListener(this);
		mul= new Button("Multipication");
		add(mul);
		mul.addActionListener(this);
		div= new Button("Division");
		add(div);
		div.addActionListener(this);
		reset=new Button("Reset");
		add(reset);
		reset.addActionListener(this);
		setSize(640,240);
		this.setVisible(true); 
		this.addWindowListener(this);  
	}
	public void actionPerformed(ActionEvent ae)
	{
		int number1=Integer.parseInt(tnum1.getText());
		int number2=Integer.parseInt(tnum2.getText());
		int resultint;
		String resultstr;
		String btntxt=ae.getActionCommand();
		System.out.println(btntxt+" Button Clicked");
		if(btntxt.equals("Reset"))
		{
			tnum1.setText("");
			tnum2.setText("");
			tresult.setText("");
		}
		else if(btntxt.equals("Addition"))
		{
			resultint=number1+number2;
			resultstr=""+resultint;
			tresult.setText(resultstr);
		}
		else if(btntxt.equals("Subraction"))
		{
			resultint=number1-number2;
			resultstr=""+resultint;
			tresult.setText(resultstr);
		}
		else if(btntxt.equals("Multipication"))
		{
			resultint=number1*number2;
			resultstr=""+resultint;
			tresult.setText(resultstr);
		}
		else if(btntxt.equals("Division"))
		{
			resultint=number1/number2;
			resultstr=""+resultint;
			tresult.setText(resultstr);
		}

	} 
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}

	public static void main(String args[])
	{
		Calculator c = new Calculator("Basic Calculator");
	}
}