class ExperienceException extends Exception
{
	public ExperienceException(String str)
	{
		super(str);
	}
}
class Employee 
{
	String id,name;
	int exp;
	float salary;
	Employee(String id,String name,int exp,float salary) throws ExperienceException
	{
		this.id=id;
		this.name=name;
		if(exp>0&&exp<40)
		{
		this.exp=exp;
		}
		else
		{
			throw new ExperienceException("Passed Experience Years is Invalid");
		}
		this.salary=salary;
	}
	void display()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Exp : "+exp);
		System.out.println("Salary : "+salary);
	}
}
class ExperienceExceptionMain
{
	public static void main(String args[])
	{
		try
		{
			Employee e1=new Employee("E1","Mihir",-1,10000);
			e1.display();

		}
		catch(ExperienceException ee)
		{
			System.out.println(ee);
		}
		try
		{
			Employee e2=new Employee("E2","Mihir",30,10000);
			e2.display();
		}
		catch(ExperienceException ee)
		{
			System.out.println(ee);
		}		
	}
}