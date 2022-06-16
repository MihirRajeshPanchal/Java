//Write a Program which reads the contents of one file and writes it to other file. Copying content of one file to other
import java.io.*;
import java.util.Scanner;
class CopyPaste 
{
	public static void main(String args[]) throws Exception 
	{
		String cpypth,pstpth;
		String cpytxt="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Copy Path : ");
		cpypth=sc.nextLine();
		System.out.print("Enter Paste Path : ");
		pstpth=sc.nextLine();
		InputStream fin = new FileInputStream(cpypth);
		int i;
		do 
		{
			i = fin.read();
			if(i != -1) 
			{
				cpytxt=cpytxt+(char)i;
			}
		}while(i != -1);
		byte buf[] = cpytxt.getBytes();
		OutputStream f1 = new FileOutputStream(pstpth);
		f1.write(buf);
		f1.close();
		fin.close();
		System.out.println("Copy Paste Complete!!!");
	}
}
