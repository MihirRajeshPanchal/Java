import java.util.Scanner;
class FilePath
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String : ");
		str=sc.nextLine();//input
		String tstr;
		tstr=str.trim();//trim string from both sides
		int lastslash=tstr.lastIndexOf('\\');//was getting error for single slash googled it and found solution
		int lastdot=tstr.lastIndexOf('.');//last index of dot
		int lengthofstring=tstr.length();//whole length of string
		String filename=tstr.substring((lastslash+1),lengthofstring);//extract string from / to end
		String fileextension=tstr.substring(lastdot,lengthofstring);//extract string from dot to end
		System.out.println("File Opened for the given file path : "+filename);//output file name
		System.out.println(filename+" must be opened by an application which support "+fileextension+" extension");//output file extension
	}
}