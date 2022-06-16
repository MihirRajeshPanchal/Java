import java.util.Scanner;
class LengthMain
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter a String : ");
		str=sc.nextLine();
		int i=0;
		try
		{
			while(true)
			{
				str.charAt(i);
				i++;
			}
		}
		catch(Exception e)
		{
			//empty
		}
		finally
		{
			System.out.println("Length of String is : "+i);
		}

	}
}