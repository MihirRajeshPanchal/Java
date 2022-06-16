import java.util.Scanner;
class EmployeeMain
{
	int ea,ta,id,basic;
	float hra,da,gsal;
}
class Employee
{
	public static void main(String args[])
	{
		byte level;
		String employeename;
		EmployeeMain b1=new EmployeeMain();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		b1.id=sc.nextInt();
		System.out.print("Enter Employee Name : ");
		employeename=sc.nextLine();	
		sc.nextLine();
		System.out.print("Enter Employee Allowances Level : ");
		level=sc.nextByte();
		System.out.print("Enter Employee Basic Salary : ");
		b1.basic=sc.nextInt();
		b1.hra=45*b1.basic/100;
		b1.da=65*b1.basic/100;
		switch(level)
		{
			case 1:
				b1.ea=3000;
				b1.ta=6000;
				break;
			case 2:
				b1.ea=2000;
				b1.ta=5000;
				break;
			case 3:
				b1.ea=1000;
				b1.ta=3000;
				break;
			case 4:
				b1.ea=500;
				b1.ta=1500;
				break;
			default:
			    System.out.println("Invalid Employee Allowance Level");
			    System.exit(0);
				break;
		}
				b1.gsal=b1.hra+b1.da+(float)b1.ea+(float)b1.ta+b1.basic;
				System.out.println("Employee ID : "+b1.id);
				System.out.println("Employee Name : "+employeename);
				System.out.println("Entertainment Allowances are : "+b1.ea);
				System.out.println("Travel Allowances are : "+b1.ta);
				System.out.println("HRA is : "+b1.hra);
				System.out.println("DA is : "+b1.da);
				System.out.print("Gross Salary is : "+b1.gsal);
	}
}