import java.util.Scanner;
class RunTimeArray
{
	public static void main(String args[])
	{
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The size of array : ");
		size=sc.nextInt();
		float a[]=new float[size];
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter Elememts : ");
			a[i]=sc.nextFloat();
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("Elememts are : "+a[i]);
		}
	}
}