class ThrowMain
{
	static int a=100,b=0,c;
	static void throwfun()
	{
		try
		{
			c=a/b;
			System.out.println(c);
			throw new ArithmeticException();
		}
		catch(ArithmeticException eh)
		{
			System.out.println("Cannot Divide a Number by Zero ");
		}
		System.out.println("Exception Handled");
	}
	public static void main(String args[])
	{
		ThrowMain.throwfun();//static function call can also be called by throwfun
	}
}