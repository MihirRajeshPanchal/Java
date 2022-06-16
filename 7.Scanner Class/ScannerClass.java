import java.util.Scanner;
class ScannerClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the First Number : ");
		a=sc.nextInt();
		System.out.print("Enter the Second Number : ");
		b=sc.nextInt();
		c=a+b;
		System.out.print("Sum of two Numbers "+a+ " and " +b+ " is "+c);
	}
}