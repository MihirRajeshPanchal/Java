import java.util.Scanner;
class Employee
{
	String jobnumber;
	int level,ca,ea;
	float bsal,hra,gsal,tgsal;
	void setEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Job Number : ");
		jobnumber=sc.nextLine();
		System.out.print("Enter the Level Number : ");
		level=sc.nextInt();
		System.out.print("Enter the Basic Pay : ");
		bsal=sc.nextFloat();	
	}
	void evaluation()
	{
		if(level==1)
		{
			ca=1000;
			ea=500;
		}
		else if(level==2)
		{
			ca=750;
			ea=200;
		}
		else if(level==3)
		{
			ca=500;
			ea=100;
		}
		else if(level==4)
		{
			ca=250;
			ea=0;
		}
		hra=(25*bsal)/100;
		gsal=bsal+ea+ca+hra;
		if(gsal<=2000)
		{
			tgsal=gsal;
		}
		else if(gsal>2000&&gsal<=4000)
		{
			tgsal=gsal-((3*gsal)/100);
		}
		else if(gsal>4000&&gsal<=5000)
		{
			tgsal=gsal-((5*gsal)/100);
		}
		else if(gsal>5000)
		{
			tgsal=gsal-((8*gsal)/100);
		}
	}
	void getEmployee()
	{
		System.out.println("\nJob Number : "+jobnumber);
		System.out.println("Level Number : "+level);
		System.out.println("Basic Pay : "+bsal);
		System.out.println("Conveyance Allowance : "+ca);	
		System.out.println("Entertainment Allowance : "+ea);
		System.out.println("House Rent Allowance : "+hra);
		System.out.println("Gross Salary Before Tax Deduction : "+gsal);
		System.out.println("Income Tax : "+(gsal-tgsal));
		System.out.println("Gross Salary : "+tgsal);	
	}

}
class EmployeeMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("Enter The Number of Employee : ");
		size=sc.nextInt();
		Employee e[]=new Employee[size];
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println("\nEmployee "+(i+1));
			e[i]=new Employee();
			e[i].setEmployee();
			e[i].evaluation();
			e[i].getEmployee();
		}
	}
}