class TwoThread
{
	public static void main(String args[])
	{
		new MyChild("Child 1");
		new MyChild("Child 2");
		new MyChild("Child 3");
		System.out.println("Inside Main Method");
		Thread t=Thread.currentThread();
		t.setPriority(10);
		t.setName("Main");
		System.out.println(t);

		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main : "+i);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Generated");
		}
	}
}
class MyChild extends Thread
{
	MyChild(String name)
	{
		super(name);
		System.out.println(this);
		start();
	}

	public void run()
	{
		try
		{
			Thread ct=Thread.currentThread();
			for(int i=1;i<=5;i++)
			{
				System.out.println(ct.getName()+" : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Generated");
		}	
	}
}