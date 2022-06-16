class OverLoadDemo
{
	void test()
	{
	System.out.println("No Parameters");
	}

	void test(int a)
	{
	System.out.println("A = "+a);
	}

	void test(int a,int b)
	{
	System.out.println("A = "+a+"\tB = "+b);
	}

	float test(float a)
	{
	System.out.println("A = "+a);
	return a*a;
	}
}

class OverloadMain
{
	public static void main(String args[])
	{
	OverLoadDemo ob = new OverLoadDemo();
	float result;
	ob.test();
	ob.test(10);
	ob.test(10,20);
	result = ob.test((float)123.25);
	System.out.println("Result of ob.test(123.25) : "+result);
	}
}