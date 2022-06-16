class DivisibleBySeven
{
	public static void main(String args[])
	{
	int count=0,i;
	for(i=1;i<=100;i++)
	{
		if(i%7==0)
		{
		count++;
		}
	}
	System.out.println(count+" are divisible by 7 between 1 to 100 ");
	}
} 