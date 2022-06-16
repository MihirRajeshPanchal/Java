class ArrayIndex
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4};
		try
		{
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index is out of Bound");
		}
		System.out.println("Exception Handled");
	}
}