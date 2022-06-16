class EvenThread implements Runnable
{
	int start,end;
	String name;
	Thread t;
	EvenThread(String name,int s,int e)
	{
		this.name=name;
		start=s;
		end=e;
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=start;i<=end;i++)
			{
				if(i%2==0)
				{
					System.out.println(name+" : "+i);
					Thread.sleep(50);
				}
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}
	}
}
class OddThread implements Runnable
{
	int start,end;
	String name;
	Thread t;
	OddThread(String name,int s,int e)
	{
		this.name=name;
		start=s;
		end=e;
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=start;i<=end;i++)
			{
				if(i%2!=0)
				{
					System.out.println(name+" : "+i);
					Thread.sleep(50);
				}
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}
	}
}
class EvenOddThreadMain
{
	public static void main(String args[])
	{
		EvenThread et1=new EvenThread("Even",1,100);
		OddThread et2=new OddThread("Odd",1,100);
		try
		{
			et1.t.join();
			et2.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}		
	}
}