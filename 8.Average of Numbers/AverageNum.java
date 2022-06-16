import java.util.Scanner;
class AverageNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		float c;
		System.out.print("Enter the First Number : ");
		a=sc.nextInt();
		System.out.print("Enter the Second Number : ");
		b=sc.nextInt();
		c=(float)(a+b)/2;
		System.out.print("Average of two Numbers "+a+ " and " +b+ " is "+c);
	}
}