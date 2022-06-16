import java.util.Scanner;
class Person
{
	int id;
	String name,city;
	Person(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	void getPerson()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("City : "+city);
	}
}
class VisitingTeacher extends Person
{
	int exp,rph;
	VisitingTeacher(int id,String name,String city,int exp,int rph)
	{
		super(id,name,city);
		this.exp=exp;
		this.rph=rph;
	}
	void getTeacher()
	{
		getPerson();
		System.out.println("Exp : "+exp);
		System.out.println("Rate Per Hour : "+rph);
	}
	float calSalary()
	{
		Scanner sc=new Scanner(System.in);
		int nhrs;
		System.out.print("Enter Number of Hours : ");
		nhrs=sc.nextInt();
		if(nhrs<40)
		{
			return nhrs*rph;
		}
		else
		{
			return (40*rph)+((nhrs-40)*rph*1.5f);
		}
	}
}
class Pupil extends Person
{
	int sem;
	String branch;
	int sub[],n;
	Pupil(int id,String name,String city,String branch,int sem)
	{
		super(id,name,city);
		this.branch=branch;
		this.sem=sem;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number of Subjects : ");
		n=sc.nextInt();
		sub=new int [n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Marks of Subject "+(i+1)+" : ");
			sub[i]=sc.nextInt();
		}
	}
	float avgMarks()
	{
		int sum=0;
		for(int i=0;i<sub.length;i++)
		{
			sum=sum+sub[i];
		}
		return (float)sum/sub.length;
	}
	void getPupil()
	{
		getPerson();
		System.out.println("Semester : "+sem);
		System.out.println("Branch : "+branch);
		for(int i=0;i<n;i++)
		{
			System.out.println("Marks of Subject "+(i+1)+" : "+sub[i]);
		}
	}
}
class PersonMain
{
	public static void main(String args[])
	{
		//Person p=new Person(1,"Mihir","Mumbai");
		//p.getPerson();
		System.out.println("\nVisiting Teacher : \n");
		VisitingTeacher v=new VisitingTeacher(1,"Mihir","Mumbai",1,500);
		v.getTeacher();
		//v.calSalary();
		System.out.println("Salary of Teacher : "+v.calSalary());
		System.out.println("\nPupil : \n");
		Pupil p=new Pupil(1,"Mihir","Mumbai","IT",3);
		p.getPupil();
		System.out.println("Average Marks : "+p.avgMarks());
	}
}