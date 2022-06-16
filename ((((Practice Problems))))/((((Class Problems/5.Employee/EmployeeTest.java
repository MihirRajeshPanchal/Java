import java.util.Scanner;
class Employee
{
	private int id;
	private String firstName,lastName;
	private	double salary,tsal,percent;
	//there is ambiguity in problem statement in paragraph statement it is said take salary in double 
	//and in graphical it is said to take int (I have taken double cause the salary mentioned is not basic salary)

	Employee(int id,String firstName,String lastName)//constructor
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}

	void setSalary(double salary)//set salary
	{
		if(salary>0)
		{
			this.salary=salary;
		}
		else
		{
			System.out.println("Salary Value not set");
		}
	}

	int getID()//return id
	{
		return id;
	}

	String getFirstName()//return firstname
	{
		return firstName;
	}

	String getLastName()//return lastname
	{
		return lastName;
	}

	String getName()//return full name
	{
		firstName=firstName.concat(" ");
		return firstName.concat(lastName);
	}

	double getSalary()//return salary
	{
		return salary;
	}

	double getAnnualSalary()//return annual salary
	{
		return salary*12;
	}

	double raiseSalary(double percent)//return raised salary
	{
		this.percent=percent;
		//System.out.println()
		tsal=salary*12+salary*12*percent/100;
		return tsal;
	}

	public String toString()//return toString
	{
		return "Employee[ID="+id+",Name="+firstName+lastName+",Salary="+tsal+"]";
	}
}
class EmployeeTest
{
	public static void main(String args[])
	{
		double sal,percent;
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee(0001,"Mihir","Panchal");
		System.out.println("ID : "+e1.getID());
		System.out.println("First Name : "+e1.getFirstName());
		System.out.println("Last Name : "+e1.getLastName());
		System.out.println("Full Name : "+e1.getName());
		System.out.print("Enter Monthly Salary : ");
		sal=sc.nextDouble();
		e1.setSalary(sal);
		System.out.println("Salary Monthly : "+e1.getSalary());
		System.out.println("Annual Salary : "+e1.getAnnualSalary());	
		System.out.println("Raised Annual Salary : "+e1.raiseSalary(10.0));
		System.out.println(e1.toString());
	}
}