import java.util.Scanner;
class Computer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long bsal=15000,n,commission,bonussal,gsal;
		System.out.print("Enter the number of computers : ");
		n=sc.nextInt();
		bonussal=2000*n;
		commission=2*bonussal/100;
		gsal=commission+bonussal+bsal;
		System.out.println("Basic salary is "+bsal);
		System.out.println("Bonus salary is "+bonussal);
		System.out.println("Commission is "+commission);
		System.out.println("Gross salary is "+gsal);
	}
}