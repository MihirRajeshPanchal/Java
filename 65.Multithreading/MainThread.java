class MainThread
{
	public static void main(String args[])
	{
		System.out.println("Inside Main Method");
		Thread t=Thread.currentThread();
		t.setPriority(10);
		t.setName("Mihir");
		System.out.println(t);

		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Generated");
		}
	}
}
