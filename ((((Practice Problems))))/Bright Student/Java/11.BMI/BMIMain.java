import java.awt.*;
import java.awt.event.*;

class BMI extends Frame implements ActionListener,WindowListener
{
    Label wlbLabel,hlLabel,resultLabel;
    TextField wTextField,hTextField,resultField;
    Button reset,cal;
    BMI(String title)
    {
        super(title);
		setLayout(new FlowLayout());

        wlbLabel=new Label("Enter Weight : ");
        add(wlbLabel);
        wTextField=new TextField(70);
        add(wTextField);

        hlLabel=new Label("Enter Height : ");
        add(hlLabel);
        hTextField=new TextField(70);
        add(hTextField);

        resultLabel=new Label("BMI Value : ");
        add(resultLabel);
        resultField=new TextField(70);
        add(resultField);
        resultField.setEditable(false);

        reset=new Button("Reset");
        add(reset);
        reset.addActionListener(this);

        cal=new Button("Calculate");
        add(cal);
        cal.addActionListener(this);
        
        setSize(640,1240);
		this.setVisible(true); 
		this.addWindowListener(this); 
    }
    public void actionPerformed(ActionEvent ae)
	{
		String resultstr;
		String btntxt=ae.getActionCommand();
		System.out.println(btntxt+" Button Clicked");
        if(btntxt.equals("Reset")) 
        {
            wTextField.setText("");
            hTextField.setText("");
            resultField.setText("");
        }
        else if(btntxt.equals("Calculate"))
        {
            double w=Double.parseDouble(wTextField.getText());
            double h=Double.parseDouble(hTextField.getText());
            double bmi=w/(h*h);
            resultstr=""+bmi;
            resultField.setText(resultstr); 
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

}
public class BMIMain 
{    public static void main(String[] args) 
    {
        BMI b = new BMI("BMI");
    }    
}
