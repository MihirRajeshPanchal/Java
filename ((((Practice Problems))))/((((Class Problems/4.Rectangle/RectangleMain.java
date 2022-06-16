import java.util.Scanner;
class Rectangle
{
	float length,width;
	Scanner sc=new Scanner(System.in);
	Rectangle()//default constructor
	{
		length=1.0f;
		width=1.0f;
	}

	Rectangle(float length,float width)//parameterized constructor
	{
		this.length=length;
		this.width=width;
	}

	float getLength()//return length
	{
		return length;
	}

	float getWidth()//return width
	{
		return width;
	}

	void setLength()//set user input length
	{
		System.out.print("Enter Length of Rectangle : ");
		length=sc.nextFloat();
	}

	void setWidth()//set user input width
	{
		System.out.print("Enter Width of Rectangle : ");
		width=sc.nextFloat();
	}

	double getArea()//return area
	{
		return width*length;
	}

	double getPerimeter()//return perimeter
	{
		return 2*(length+width);
	}

	public String toString()//was getting error when public was not put googled it and found solution 
	{
		return "Rectangle[Length="+length+",Width="+width+"]";
	}
}
class RectangleMain
{
	public static void main(String args[])
	{
														//default constructor function calls
		System.out.println("\nDefault Constructor : ");
		Rectangle r1=new Rectangle();
		System.out.println("Length : "+r1.getLength());
		System.out.println("Width : "+r1.getWidth());
		System.out.println("Perimeter : "+r1.getPerimeter());
		System.out.println("Area : "+r1.getArea());
		System.out.println(r1.toString());
														//parameterized constructor calls
		System.out.println("\nParameterized Constructor : ");
		Rectangle r2=new Rectangle(5.0f,10.0f);
		System.out.println("Length : "+r2.getLength());
		System.out.println("Width : "+r2.getWidth());
		System.out.println("Perimeter : "+r2.getPerimeter());
		System.out.println("Area : "+r2.getArea());
		System.out.println(r2.toString());
														//user input function calls
		System.out.println("\nUser Input : ");
		Rectangle r3=new Rectangle();
		r3.setLength();
		r3.setWidth();
		System.out.println("Length : "+r3.getLength());
		System.out.println("Width : "+r3.getWidth());
		System.out.println("Perimeter : "+r3.getPerimeter());
		System.out.println("Area : "+r3.getArea());	
		System.out.println(r3.toString());	
	}
}