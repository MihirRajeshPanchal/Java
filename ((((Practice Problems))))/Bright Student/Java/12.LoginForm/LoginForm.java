import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter
{
	LoginForm ptr;
	MyWindowAdapter(LoginForm ptr)
	{
		this.ptr=ptr;
	}
	public void windowClosing(WindowEvent we)
	{
		ptr.setVisible(false);
		ptr.dispose();
	}
}
public class LoginForm extends Frame implements ActionListener
{
    Label unlbl,passlbl;
	TextField utxt,ptxt;
	Button lgbtn,rbtn;
    LoginForm(String title)
    {
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
        rbtn = new Button("RESET");
        add(rbtn);
        setSize(640,240);
		this.setVisible(true); 
        MyWindowAdapter mwa=new MyWindowAdapter(this);
		this.addWindowListener(mwa); 
        lgbtn.addActionListener(this); 
        rbtn.addActionListener(this);
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
    public static void main(String[] args) 
    {
        LoginForm lForm=new LoginForm("Login Form");
    }

}
