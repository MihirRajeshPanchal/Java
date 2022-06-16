import java.util.Scanner;
class TaxiMeter
{
    Scanner sc=new Scanner(System.in);
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
		System.out.print("Enter Taxi Number : ");
		taxino=sc.nextInt();
		System.out.print("Enter Passenger Name : ");
		name=sc.next();
		System.out.print("Enter Number of Kilometer : ");
		km=sc.nextInt();
	}

	int calculate()
	{
		if(km<=10)
		{
			return km*25;
		}
		else if((km>10)&&(km<=60))
		{
			return 25+((km-1)*10);
		}
		else if((km>60)&&(km<=120))
		{
			return 25+(5*10)+((km-6)*15);
		}
		else if((km>120)&&(km<=200))
		{
			return 25+(5*10)+(6*15)+(km-12)*20;
		}
		else if(km>200)
		{
			return 25+(5*10)+(6*15)+(6*20)+(km-18)*25;
		}
		return 0;
	}

	void output()
	{
		System.out.println("Taxi No.\tName\tKm Travelled\tBill Amount\tBill Amount (With GST)");
		System.out.println(taxino+"\t\t"+name+"\t\t"+km+"\t\t"+calculate()+"\t\t"+(calculate()+(calculate()*0.09)));
	}
}
class TaxiMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number of Rides : ");
		int rides=sc.nextInt();
		TaxiMeter t[]=new TaxiMeter[rides];
		for(int i=0;i<rides;i++)
		{
			t[i]=new TaxiMeter();
			t[i].input();
			t[i].calculate();
			t[i].output();
		}

	}
}