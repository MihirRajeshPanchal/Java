import java.util.Scanner;
class BoxMain
{
	double w,d,h;

	BoxMain(double wi,double he,double de)
	{
	w=wi;
	d=de;
	h=he;
	}//constructor
	void setBox()
	{
		//System.out.println(this);
		//this stores a reference to the object who has invoked the method presently
		//this can be used inside any method to refer to the current object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Width : ");
		w=sc.nextDouble();
		System.out.print("Enter Depth : ");
		d=sc.nextDouble();
		System.out.print("Enter Height : ");
		h=sc.nextDouble();
	}
	void getBox()
	{
		System.out.println("Width : "+w);
		System.out.println("Depth : "+d);
		System.out.println("Height : "+h);
	}
	double volume()
	{
		return w*d*h;
	}
}
class Box
{
	public static void main(String args[])
	{
		BoxMain b1=new BoxMain(2.0,3.0,4.0);
		//System.out.println(b1);
		//b1.setBox();
		b1.getBox();
		System.out.println("Volume of Box : "+b1.volume());

	}
}