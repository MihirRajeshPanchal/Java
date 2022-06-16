import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num,fact=1,i;
	System.out.print("Enter the number : ");
	num=sc.nextInt();
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("The Factorial of "+num+" is : "+fact);
	}
} 