import java.awt.*;
public class LoginFrame extends Frame
{
	//
	Label unlbl,passlbl;
	TextField utf,ptf;
	Button lbtn,rbtn;

	LoginFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		setSize(640,480);
		setVisible(true);
		unlbl=new Label("User Name : ");
		add(unlbl);
		utf=new TextField(15);
		add(utf);
		passlbl=new Label("Password : ");
		add(passlbl);
		ptf=new TextField(10);
		ptf.setEchoChar('*');
		add(ptf);
		lbtn=new Button("Login");
		add(lbtn);
		rbtn=new Button("Reset");
		add(rbtn);
	}
	public static void main(String args[])
	{
		LoginFrame window=new LoginFrame("Login Frame");
	}
}