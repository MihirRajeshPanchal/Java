import java.util.Scanner;
class Date
{
	private int month,day,year;
	Scanner sc=new Scanner(System.in);
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	int getDay()
	{
		return day;
	}

	int getMonth()
	{
		return month;
	}

	int getYear()
	{
		return year;
	}

	void setDay()
	{
		System.out.print("\nEnter Day : ");
		day=sc.nextInt();
	}

	void setMonth()
	{
		System.out.print("Enter Month : ");
		month=sc.nextInt();
	}

	void setYear()
	{
		System.out.print("Enter Year : ");
		year=sc.nextInt();
		System.out.println();
	}

	/*void setDate()
	{
		System.out.println("Enter Date : ");
		date=sc.nextInt();
	}*/

	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
}
class DateTest
{
	public static void main(String args[])
	{
		Date d1=new Date(16,8,2004);
		System.out.println("Day : "+d1.getDay());
		System.out.println("Month : "+d1.getMonth());
		System.out.println("Year : "+d1.getYear());
		System.out.println("Date : "+d1.toString());

		Date d2=new Date(16,8,2004);
		d2.setDay();
		d2.setMonth();
		d2.setYear();
		System.out.println("Day : "+d2.getDay());
		System.out.println("Month : "+d2.getMonth());
		System.out.println("Year : "+d2.getYear());
		System.out.println("Date : "+d2.toString());
	}
}