import java.util.Scanner;
class SquareCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i=0,flag=0;
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		for(i=0;i<num;i++)
		{
			if(i*i==num)
			{
				System.out.println("Entered Number "+num+" is a perfect Square ");
				System.out.println(+num+" is Square of "+i);
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Entered Number "+num+" is not a perfect Square ");
		}
	}
}