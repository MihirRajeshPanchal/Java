class ThreadRunnable
{
	public static void main(String args[])
	{
		new MyChildRunnable("Child 1");
		new MyChildRunnable("Child 2");
		new MyChildRunnable("Child 3");
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
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Generated");
		}
	}
}
class MyChildRunnable implements Runnable
{
	Thread t;
	MyChildRunnable(String name)
	{
		t=new Thread(this,name);
		t.start();
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