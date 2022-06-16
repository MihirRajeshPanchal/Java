class StaticDemo
{
	static int a=42;
	static int b=99;

	static void callme()
	{
	System.out.println("A = "+a);
	}
}

class StaticMain
{
	public static void main(String args[])
	{
	StaticDemo.callme();
	System.out.println("B = "+StaticDemo.b);
	}
}