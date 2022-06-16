class ThreadMethods
{
	public static void main(String args[])
	{
		new RunnableThread("Child 1");
		new RunnableThread("Child 2");
		new RunnableThread("Child 3");
		System.out.println("Inside Main Method");
		Thread t=Thread.currentThread();
		t.setPriority(10);
		t.setName("Main");
		System.out.println(t.getName());
		System.out.println(t.getPriority());

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
class RunnableThread implements Runnable
{
	Thread t;
	RunnableThread(String name)
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