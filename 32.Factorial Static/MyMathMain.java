import java.util.Scanner;
class MyMath
{
static long fact(int num)
{
int i;
long f=1;
	for(i=1;i<=num;i++)
	{
		f=f*i;
	}
return f;
}
}
class MyMathMain
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int n=sc.nextInt();
  	long ans=MyMath.fact(n);
  	System.out.println("Factorial of "+n+" is "+ans);
	}
}