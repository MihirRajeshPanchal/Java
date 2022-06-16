class PrimitiveArray
{
	public static void main(String args[])
	{
		int i;
		/*float a[]=new float[10];
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}*/
		//Compile time Initialization
		int a[]={1,2,3,4,5};
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		char c[]={'h','e','l','l','o'};
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}
}