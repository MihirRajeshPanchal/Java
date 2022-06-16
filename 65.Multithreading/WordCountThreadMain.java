class WordCountThread implements Runnable
{
	String name,str,tstr;
	char cstr;
	int countword=1;
	Thread t;
	static int totalwc;
	WordCountThread(String name,String str)
	{
		this.name=name;
		this.str=str;
		t=new Thread(this,name);
		tstr=str.trim();
		t.start();
	}
	public void run()
	{
		for(int i=0;i<tstr.length();i++)
		{
			if(tstr.charAt(i)==' '&&tstr.charAt(i+1)!=' ')
			{
				countword+=1;
			}
		}
		System.out.println(name+" : "+countword);
		totalwc=totalwc+countword;
	}
}
class WordCountThreadMain
{
	public static void main(String args[])
	{

		WordCountThread et1=new WordCountThread("WordCount_1","Mihir        is a boy");
		WordCountThread et2=new WordCountThread("WordCount_2","Hello");
		WordCountThread et3=new WordCountThread("WordCount_3","Hello World");
		try
		{
			et1.t.join();
			et2.t.join();
			et3.t.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException caught");
		}		
		System.out.println("Total Count of Words in Threads  : "+WordCountThread.totalwc);
	}
}