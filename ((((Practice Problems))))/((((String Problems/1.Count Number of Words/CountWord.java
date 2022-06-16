import java.util.Scanner;
class CountWord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;//count =0 initialization
		String str;
		System.out.print("Enter String : ");
		str=sc.nextLine();//input
		String tstr;
		tstr=str.trim();//trim the string from ends 
		char s[]=tstr.toCharArray();//string to char array
		for(int i=0;i<s.length;i++)
		{
			if((s[i]==' ')&&(s[i+1]!=' '))//when space is encounted and the character next to space is not space but a letter
			{
				count++;//then count ++
			}
		}
		System.out.println("Entered String is : "+tstr);
		System.out.println("Number of Words in String are : "+(count+1));//if there ar n spaces in a sentence then words will always be n+1 
	}
}