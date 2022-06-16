import java.io.*;
class ThrowsIOMain
{
	static int a[]={1,2,3,4};
	static void throwsfun() throws IOException
	{
		try
		{
			throw new IOException();
		}
		catch(IOException ai)
		{
			System.out.println("IO Exception found in Function");
		}
	}
	public static void main(String args[])
	{
		try
		{
		ThrowsIOMain.throwsfun();//static function call can also be called by throwfun
		}
		catch(IOException ai)
		{
			System.out.println("IO Exceptionfound in Main");
		}
		System.out.println("Exception Handled from Main");
	}
}