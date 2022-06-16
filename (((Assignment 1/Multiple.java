import java.util.Scanner;
class Multiple
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2=sc.nextInt();
		if(num2%num1==0)
		{
			System.out.println(num1+" is multiple of "+num2);
		}
		else
		{
			System.out.println(num1+" is not multiple of "+num2);
		}
	}
}