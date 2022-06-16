import java.util.*;

class Internet
{
	public static void main(String[] args) 
	{
		double filesize,megabits,seconds;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How many Gigabytes your File is (GB) : ");
		filesize=sc.nextDouble();
		System.out.print("Enter Internet Download Speed (Mbps) : ");
		megabits=sc.nextDouble();

		seconds=(filesize*1000)/(megabits/8);
		System.out.println("Time Taken in Seconds : "+seconds);
		System.out.println("Time Taken in Minutes : "+(seconds/60));
		System.out.println("Time Taken in Hours : "+(seconds/3600));

	}
	
}