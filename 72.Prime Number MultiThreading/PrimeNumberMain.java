class PrimeNumber implements Runnable
{
	String name;
	int start,end;
	int primecount=0;
	int i,num=0;
	Thread t;
	static int totalprimecount;
	PrimeNumber(String name,int start,int end)
	{
		this.name=name;
		this.start=start;
		this.end=end;
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
		try
		{
			for (i = start; i <= end; i++)         
			{ 		  	  
				int counter=0; 	  
				for(num =i; num>=1; num--)
				{
					if(i%num==0)
					{
						counter = counter + 1;
					}
				}
				if(counter==2)
				{
					System.out.println(name+" : "+i);
					primecount++;
					Thread.sleep(500);
				}	
			}	
			System.out.println("Prime Numbers between "+start+" - "+end+" is : "+primecount);
			totalprimecount=totalprimecount+primecount;
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}
	}
}
class PrimeNumberMain
{
	public static void main(String args[])
	{

		PrimeNumber et1=new PrimeNumber("PrimeCount_1",1,100);
		PrimeNumber et2=new PrimeNumber("PrimeCount_2",101,200);
		PrimeNumber et3=new PrimeNumber("PrimeCount_3",201,300);
		PrimeNumber et4=new PrimeNumber("PrimeCount_4",301,400);
		PrimeNumber et5=new PrimeNumber("PrimeCount_5",401,500);
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
		System.out.println("Total Prime Numbers in Threads  : "+PrimeNumber.totalprimecount);
	}
}