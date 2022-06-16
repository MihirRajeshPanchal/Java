class A
{
	int i,j;
	void showij()
	{
	System.out.println("I : "+i);
	System.out.println("J : "+j);
	}
}

class B extends A
{
	int k;
	void showk()
	{
	System.out.println("K : "+k);
	}
	void sum()
	{
	System.out.println("I+J+K : "+(i+j+k));
	}
}

class SimpleInheritance
{
	public static void main(String args[])
	{
	A superOb=new A();
	B subOb=new B();
	subOb.i=7;
	subOb.j=8;
	subOb.k=9;
	subOb.showij();
	subOb.showk();
	subOb.sum();
	}
}