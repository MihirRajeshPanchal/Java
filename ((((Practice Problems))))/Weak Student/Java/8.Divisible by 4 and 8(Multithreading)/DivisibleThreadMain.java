class DivisibleThread implements Runnable
{
	static int totald;
	int start,end;
	String name;
	int count;
	Thread t;
	DivisibleThread(String name,int start,int end)
	{
		this.name=name;
		this.start=start;
		this.end=end;
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
		for(int i=start;i<=end;i++)
		{
			if(i%8==0)//&&i%4==0) //if i is divisble by 8 then definetly it is divisible by 4
			{
				count+=1;
			}
		}
		System.out.println(name+" : "+count);
		totald=totald+count;
	}
}
class DivisibleThreadMain
{
	public static void main(String args[])
	{

		DivisibleThread et1=new DivisibleThread("Thread_1",1,100);
		DivisibleThread et2=new DivisibleThread("Thread_2",101,200);
		DivisibleThread et3=new DivisibleThread("Thread_3",201,300);
		DivisibleThread et4=new DivisibleThread("Thread_4",301,400);
		try
		{
			et1.t.join();
			et2.t.join();
			et3.t.join();
			et4.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}		
		System.out.println("Total Numbers Divisible by 4 and 8 are : "+DivisibleThread.totald);
	}
}