import java.util.Scanner;
class TaxiMeter
{
	int taxino,km;
	String name;
	TaxiMeter()
	{
		taxino=0;
		name="";
		km=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Taxi Number : ");
		taxino=sc.nextInt();
		System.out.print("Enter Passenger Name : ");
		name=sc.next();
		System.out.print("Enter Number of Kilometer : ");
		km=sc.nextInt();
	}

	int calculate()
	{
		if(km<=1)
		{
			return km*25;
		}
		else if((km>1)&&(km<=6))
		{
			return 25+((km-1)*10);
		}
		else if((km>6)&&(km<=12))
		{
			return 25+(5*10)+((km-6)*15);
		}
		else if((km>12)&&(km<=18))
		{
			return 25+(5*10)+(6*15)+(km-12)*20;
		}
		else if(km>18)
		{
			return 25+(5*10)+(6*15)+(6*20)+(km-18)*25;
		}
		return 0;
	}

	void output()
	{
		System.out.println("Taxi No.\tName\tKm Travelled\tBill Amount");
		System.out.println(taxino+"\t\t"+name+"\t\t"+km+"\t\t"+calculate());
	}
}
class TaxiMain
{
	public static void main(String args[])
	{
		TaxiMeter t=new TaxiMeter();
		t.input();
		t.calculate();
		t.output();
	}
}