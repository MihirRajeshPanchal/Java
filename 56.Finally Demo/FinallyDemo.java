class FinallyDemo
{
	static void procA()
	{
		try
		{
			System.out.println("Inside ProcA");
			throw new RuntimeException("DEMO");
		}
		finally
		{
			System.out.println("procA's Finally");
		}
	}/*
	static void procB()
	{
		try
		{
			System.out.println("Inside ProcB");
			return;
		}
		finally
		{
			System.out.println("procB's Finally");
		}
	}
	static void procC()
	{
		try
		{
			System.out.println("Inside ProcC");
		}
		finally
		{
			System.out.println("procC's Finally");
		}
	}*/
	public static void main(String args[])
	{
		try
		{
		procA();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
		//procB();
		//procC();
	}
}