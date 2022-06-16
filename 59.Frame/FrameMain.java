import java.awt.*;
class MyFrame extends Frame
{
	Frame f;
	MyFrame(String title)
	{
		f=new Frame(title);
		f.setSize(640,480);
		f.setVisible(true);
	}
}
class FrameMain
{
	public static void main(String args[])
	{
		MyFrame mf=new MyFrame("Mihir");
		//mf.setSize(640,480);
		//mf.setVisible(true);
	}
}