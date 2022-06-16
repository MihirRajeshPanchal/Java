import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener,WindowListener
{
	Label unlbl,passlbl;
	TextField utxt,ptxt;
	Button lgbtn,rbtn;
	LoginForm(String title)
	{
		//callthe superclass constructor
		super(title);//This will set the title of frame can be done be setTitle() also
		setLayout(new FlowLayout());
        unlbl = new Label("User Name : ");
        add(unlbl);
        utxt = new TextField(70);
        add(utxt);
        passlbl= new Label("Password :   ");
        add(passlbl);
        ptxt = new TextField(70);
        add(ptxt);
        ptxt.setEchoChar('*');
        lgbtn = new Button("LOGIN");
        add(lgbtn);
        lgbtn.addActionListener(this); 
        rbtn = new Button("RESET");
        add(rbtn);
        rbtn.addActionListener(this);
		setSize(640,240);
		this.setVisible(true); 
		this.addWindowListener(this);                                                    
	}

	public void actionPerformed(ActionEvent ae)
	{
		String btntxt=ae.getActionCommand();
		System.out.println(btntxt+" Button Clicked");
		if(btntxt.equals("LOGIN"))
		{
			String uname=utxt.getText();
			String password=ptxt.getText();
			if(uname.equals("Mihir")&&password.equals("pass@123"))
			{
				System.out.println("Login Sucessful");
			}
			else
			{
				System.out.println("Login UnSuccessful");
			}
		}
		else
		{
			utxt.setText("");
			ptxt.setText("");
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
		LoginForm window = new LoginForm("Login Form Mihir");
	}
}