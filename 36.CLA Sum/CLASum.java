class CLASum
{
	public static void main(String args[])
	{
		int i,sum=0;
		for(i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum = "+sum);
	}
}