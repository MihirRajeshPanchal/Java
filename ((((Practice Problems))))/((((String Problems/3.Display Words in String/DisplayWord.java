import java.util.Scanner;
class DisplayWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String : ");
		str=sc.nextLine();//input
		String tstr;
		tstr=str.trim();//trim string from both ends
		tstr=tstr.replace(' ','\n');//replace space with next line to differentiate words from string
		System.out.println("Words in the String are as follows : ");
		System.out.println(tstr);
	}
}