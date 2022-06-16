class TestRef
{
	int a,b;
	TestRef(int i,int j)
	{
		a=i;
		b=j;
	}
	// Pass an object
	void changeOb(TestRef o)
	{
	System.out.println("Value of O = "+o);
	o.a *=2;
	o.b /=2;
	}
}

class CallByRef
{
	public static void main(String args[])
	{
		TestRef ob1 = new TestRef(15,20);
		TestRef ob2 = new TestRef(10,12);
		System.out.println("ob2.a and ob2.b before call : "+ob2.a+" "+ob2.b);
		System.out.println("Value of ob2 : "+ob2);
		ob1.changeOb(ob2);
		System.out.println("ob2.a and ob2.b after call : "+ob2.a+" "+ob2.b);
	}
}