class Circle
{
	private double radius;
	private String color;
	double area;
	Circle()//default constructor
	{
		System.out.println("Default Constructor : ");
		radius=1.0;
		color="red";
	} 
	Circle(double radius,String color)//parameterized constructor
	{
		System.out.println("Parameterized Constructor : ");
		this.radius=radius;
		this.color=color;
	}
	public double getRadius()//return radius
	{
		return radius;
	}
	public double getArea()//return area
	{
		area=3.14*Math.pow(radius,2);
		return area;
	}

}
class CircleMain
{
	public static void main(String args[])
	{
		//default constructor function calls
		Circle c1=new Circle();
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		//parameterized constructor function calls
		Circle c2=new Circle(10.0,"Blue");
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
	}
}