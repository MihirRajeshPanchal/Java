import java.util.Scanner;
class BoxStatic
{
	double w,d,h;
	static int ob_count;

	BoxStatic(double wi,double he,double de)
	{
	w=wi;
	d=de;
	h=he;
	ob_count++;
	}//constructor

	BoxStatic()
	{
	w=1.0;
	d=1.0;
	h=1.0;
	ob_count++;
	}//constructor

	BoxStatic(double len)
	{
	w=d=h=len;
	ob_count++;
	}//constructor
}

class BoxStaticMain
{
	public static void main(String args[])
	{
		BoxStatic b1=new BoxStatic();
		System.out.println("Total objects created = "+BoxStatic.ob_count);
		BoxStatic b2=new BoxStatic(5.0);
		System.out.println("Total objects created = "+BoxStatic.ob_count);
		BoxStatic b3=new BoxStatic(1.0,2.0,3.0);
		System.out.println("Total objects created = "+BoxStatic.ob_count);

	}
}