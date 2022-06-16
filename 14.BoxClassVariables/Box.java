class BoxMain
{
	double w,d,h;
}
class Box
{
	public static void main(String args[])
	{
		BoxMain b1=new BoxMain();
		b1.w=5;
		b1.d=6.9;
		b1.h=95.18;
		System.out.println("Width : "+b1.w);
		System.out.println("Depth : "+b1.d);
		System.out.println("Height : "+b1.h);
	}
}