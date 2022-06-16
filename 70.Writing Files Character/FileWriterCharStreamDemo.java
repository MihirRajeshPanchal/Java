import java.io.*;
class FileWriterCharStreamDemo 
{
	public static void main(String args[]) throws Exception 
	{
		String source = "Now is the time for all good men\n"
		+ " to come to the aid of their country\n"
		+ " and pay their due taxes.";
		char buffer[] = source.toCharArray();
		FileWriter f0 = new FileWriter("file1.txt");
		for (int i=0; i < buffer.length; i += 1) 
		{
			f0.write(buffer[i]);
		}
		f0.close();
		FileWriter f1 = new FileWriter("file2.txt");
		f1.write(buffer);
		f1.close();
	}
}
