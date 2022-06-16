import java.io.*;
class FileInputStreamDemo 
{
	public static void main(String args[]) throws Exception 
	{
		InputStream fin = new FileInputStream(args[0]);
		int i;
		do 
		{
			i = fin.read();
			if(i != -1) 
			{
				System.out.print((char) i);
			}
		}while(i != -1);
		fin.close();
	}
}
