class Class1
{
	void message()
	{
		System.out.println("Class1 Message");
	}
}
class Class2 extends Class1
{
	void message()
	{
		System.out.println("Class2 Message");
	}
}
class OverrideClassMain
{
	public static void main(String args[])
	{
		Class1 c1=new Class1();
		c1.message();
		Class2 c2=new Class2();
		c2.message();
	}
}
//output
//Class1 Message
//Class2 Message