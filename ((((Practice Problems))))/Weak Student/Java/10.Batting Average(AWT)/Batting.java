import java.awt.*;
import java.awt.event.*;

public class Batting extends Frame implements ActionListener,WindowListener
{
	Label namelbl,countrylbl,runslbl,innlbl,nnolbl,resultlbl;
	TextField nametf,countrytf,runstf,inntf,nnotf,resulttf;
	Button result,reset;
	Batting(String title)
	{
		super(title);
		setLayout(new FlowLayout());

		namelbl=new Label("Name : ");
		add(namelbl);
		nametf=new TextField(70);
		add(nametf);

		countrylbl=new Label("Country : ");
		add(countrylbl);
		countrytf=new TextField(70);
		add(countrytf);

		runslbl=new Label("Runs : ");
		add(runslbl);
		runstf=new TextField(70);
		add(runstf);

		innlbl=new Label("Innings : ");
		add(innlbl);
		inntf=new TextField(70);
		add(inntf);

		nnolbl=new Label("Number of Not Outs : ");
		add(nnolbl);
		nnotf=new TextField(70);
		add(nnotf);

		resultlbl=new Label("Result : ");
		add(resultlbl);
		resulttf=new TextField(70);
		add(resulttf);
		resulttf.setEditable(false);

		result=new Button("Result");
		add(result);
		result.addActionListener(this);

		reset=new Button("Reset");
		add(reset);
		reset.addActionListener(this);

		setSize(640,1240);
		this.setVisible(true); 
		this.addWindowListener(this); 
	}
	public void actionPerformed(ActionEvent ae)
	{
		String resultstr;
		//float resultfloat;
		String btntxt=ae.getActionCommand();
		System.out.println(btntxt+" Button Clicked");
		int runs=Integer.parseInt(runstf.getText());
		int innings=Integer.parseInt(inntf.getText());
		int nno=Integer.parseInt(nnotf.getText());

		if(btntxt.equals("Result"))
		{
			resultstr=""+(float)runs/(innings-nno);
			resulttf.setText(resultstr);
		}
		else if(btntxt.equals("Reset"))
		{
			nametf.setText("");
			countrytf.setText("");
			runstf.setText("");
			inntf.setText("");
			nnotf.setText("");
			resulttf.setText("");
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
		Batting b = new Batting("Batting");
	}
}
