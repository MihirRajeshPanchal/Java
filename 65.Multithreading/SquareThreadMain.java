class SquareThread implements Runnable
{
	int start,end;
	String name;
	Thread t;
	SquareThread(String name,int s,int e)
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
				if(Math.sqrt(i)%1==0)
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
class SquareThreadMain
{
	public static void main(String args[])
	{
		SquareThread et1=new SquareThread("Square_1",1,200);
		SquareThread et2=new SquareThread("Square_2",201,400);
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