interface Figure
{
	double area();
}
class Rectangle implements Figure
{
	double dim1,dim2;
	Rectangle(double a,double b)
	{
		dim1=a;
		dim2=b;
	}

	public double area()
	{
		System.out.println("Inside Area for Rectangle ");
		return dim1*dim2;
	}
}
class Triangle implements Figure
{
	double dim1,dim2;
	Triangle(double a,double b)
	{
		dim1=a;
		dim2=b;
	}

	public double area()
	{
		System.out.println("Inside Area for Triangle ");
		return dim1*dim2/2;
	}
}
class FigureMain
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,4);
		Figure f;
		f=r;
		System.out.println("Area is : "+f.area());
		f=t;
		System.out.println("Area is : "+f.area());
	}
}