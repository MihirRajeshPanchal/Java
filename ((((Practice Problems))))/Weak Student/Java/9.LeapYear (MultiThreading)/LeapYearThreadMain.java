class LeapYearThread implements Runnable
{
	static int totalyears;
	int start,end;
	String name;
	int count;
	Thread t;
	LeapYearThread(String name,int start,int end)
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
			if(i%4==0)
			{
				if(i%100==0)
				{
					if(i%400==0)
					{
						count+=1;
					}
				}
				else
				{
					count+=1;
				}
				
			}
		}
		System.out.println(name+" : "+count);
		totalyears=totalyears+count;
	}
}
class LeapYearThreadMain
{
	public static void main(String args[])
	{

		LeapYearThread et1=new LeapYearThread("Thread_1",1000,1200);
		LeapYearThread et2=new LeapYearThread("Thread_2",1201,1400);
		LeapYearThread et3=new LeapYearThread("Thread_3",1401,1600);
		LeapYearThread et4=new LeapYearThread("Thread_4",1601,1800);
		LeapYearThread et5=new LeapYearThread("Thread_5",1801,2000);
		try
		{
			et1.t.join();
			et2.t.join();
			et3.t.join();
			et4.t.join();
			et5.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}		
		System.out.println("Total Numbers of Leap Years : "+LeapYearThread.totalyears);
	}
}