class ThrowsMain
{
	static int a[]={1,2,3,4};
	static void throwsfun() throws ArrayIndexOutOfBoundsException
	{
		try
		{
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index is out of Bound");
		}
		System.out.println("Exception Handled from Function");
	}
	public static void main(String args[])
	{
		try
		{
		ThrowsMain.throwsfun();//static function call can also be called by throwfun
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index is out of Bound");
		}
		System.out.println("Exception Handled from Main");
	}
}