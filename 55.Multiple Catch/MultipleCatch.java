import java.util.Scanner;
class MultipleCatch
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4};
		int d=100,b=0,c;
		int choice;
		System.out.println("Menu");
		System.out.println("1.ArrayIndexOutOfBoundsException");
		System.out.println("2.ArithmeticException");
		System.out.println("3.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Choice : ");
		choice=sc.nextInt();
		try
		{
			if(choice==1)
			{
				System.out.println(a[4]);
			}
			else if(choice==2)
			{
				c=d/b;
				System.out.println(c);			
			}
			else
			{
				System.out.println("Program Terminated");
			}
		}		
		catch(ArithmeticException eh)
		{
			System.out.println("Cannot Divide a Number by Zero ");
			System.out.println("Exception Handled");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index is out of Bound");
			System.out.println("Exception Handled");
		}
		
		
	}
}
