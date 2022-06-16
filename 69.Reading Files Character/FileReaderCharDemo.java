import java.io.*;
class FileReaderCharDemo 
{
	public static void main(String args[]) throws Exception 
	{
		FileReader fr = new FileReader(args[0]);
		int ch;
		while((ch = fr.read()) != -1) 
		{
			System.out.print((char)ch);
		}
		fr.close();
	}
}
