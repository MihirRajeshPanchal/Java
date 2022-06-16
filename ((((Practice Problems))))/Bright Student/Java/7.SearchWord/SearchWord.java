import java.util.Scanner;
class SearchWord
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String : ");
		str=sc.nextLine();//input
		String tstr;
		tstr=str.trim();//trim string from both sides
		String search;
		System.out.print("Enter Word to be searched : ");
		search=sc.nextLine();//input
		i=tstr.indexOf(search);//search the word in string
		if(i==-1)
		{
			System.out.println(search+" was not found in string "+tstr);//not found
		}
		else
		{
			System.out.println(search+" was found in string "+tstr);//found
		}
	}
}