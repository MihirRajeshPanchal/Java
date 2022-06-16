class ExceptionHandling
{
	public static void main(String args[])
	{
		int a=100,b=0,c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException eh)
		{
			System.out.println("Cannot Divide a Number by Zero ");
		}
		System.out.println("Exception Handled");
	}
}