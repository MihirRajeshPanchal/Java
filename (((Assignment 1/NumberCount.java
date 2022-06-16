import java.util.Scanner;
class NumberCount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,num,cn=0,cz=0,cp=0,n;
		System.out.print("Enter Number of Elements : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print("Enter Number "+i+" : ");
			num=sc.nextInt();
			if(num<0)
			{
				cn=cn+1;
			}
			else if(num==0)
			{
				cz=cz+1;
			}
			else
			{
				cp=cp+1;
			}
		}
		System.out.println("Count of Negative Numbers : "+cn);
		System.out.println("Count of Zero : "+cz);
		System.out.println("Count of Positive Numbers : "+cp);
	}
}