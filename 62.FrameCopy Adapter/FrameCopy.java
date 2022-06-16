import java.awt.*;
import java.awt.event.*;

class MyActionHandler implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		String btntxt=ae.getActionCommand();
		System.out.println(btntxt+" Button Clicked");
		//cpytf.setText()=txttf.getText();
	}
}
class MyWindowAdapter extends WindowAdapter
{
	FrameCopy ptr;
	MyWindowAdapter(FrameCopy ptr)
	{
		this.ptr=ptr;
	}
	public void windowClosing(WindowEvent we)
	{
		ptr.setVisible(false);
		ptr.dispose();
	}
	/*public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}*/

}
public class FrameCopy extends Frame 
{
	TextField txttf,cpytf;
	Label txtlbl,cpylbl;
	Button reset,cpy;

	FrameCopy(String title)
	{
		//callthe superclass constructor
		super(title);//This will set the title of frame can be done be setTitle() also
		setLayout(new FlowLayout());
		txtlbl=new Label("Enter Text : ");
		add(txtlbl);
		txttf=new TextField(70);
		add(txttf);
		cpylbl=new Label("Copied Text : ");
		add(cpylbl);
		cpytf=new TextField(70);
		add(cpytf);
		cpytf.setEditable(false);
		cpy=new Button("Copy");
		add(cpy);
		reset=new Button("Reset");
		add(reset);
		setSize(640,240);
		this.setVisible(true); 
		MyWindowAdapter mwa=new MyWindowAdapter(this);
		this.addWindowListener(mwa); 
		MyActionHandler mah=new MyActionHandler();
		cpy.addActionListener(mah);
		reset.addActionListener(mah);
	}

	public static void main(String args[])
	{
		FrameCopy fc = new FrameCopy("Frame Copy");
	}
}