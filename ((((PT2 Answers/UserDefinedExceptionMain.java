class UserDefinedException extends Exception
{
	int a;
	UserDefinedException(int a)
	{
		this.a=a;
	}
	public String toString()
	{
		return a+" is not a Whole Number";
	}
}
class ExceptionTest
{
	static void validateWholeNumber(int wn) throws UserDefinedException
	{
		if(wn<=0)
		{
			throw new UserDefinedException(wn);
		}
	}
}
class UserDefinedExceptionMain
{
	public static void main(String args[])
	{
		try
		{
			ExceptionTest.validateWholeNumber(0);
			ExceptionTest.validateWholeNumber(-5);
		}
		catch(UserDefinedException ude)
		{
			System.out.println("Caught : "+ude);
		}
	}
}
//output
//Caught : -5 is not a Whole Number