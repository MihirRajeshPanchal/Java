import java.util.Scanner;
class DivideException
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		int c=a/b;
		System.out.println("C = "+c);
		System.out.println("End of Program");
		/*int a[]={1,2};
		a[0]=1;
		a[2]=2;*/

	}
}