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
		return nhrs*rph;
	}
}
class Pupil extends Person
{
	int sem;
	String branch;
	int m1,m2;
	Pupil(int id,String name,String city,String branch,int sem,int m1,int m2)
	{
		super(id,name,city);
		this.branch=branch;
		this.sem=sem;
		this.m1=m1;
		this.m2=m2;
	}
	float avgMarks()
	{
		return (float)(m1+m2)/2;
	}
	void getPupil()
	{
		getPerson();
		System.out.println("Semester : "+sem);
		System.out.println("Branch : "+branch);
		System.out.println("Marks of Subject 1 : "+m1);
		System.out.println("Marks of Subject 2 : "+m2);
	}
}
class PersonMain
{
	public static void main(String args[])
	{
		System.out.println("\nVisiting Teacher : \n");
		VisitingTeacher v=new VisitingTeacher(1,"Mihir","Mumbai",1,500);
		v.getTeacher();
		//v.calSalary();
		System.out.println("Salary of Teacher : "+v.calSalary());
		System.out.println("\nPupil : \n");
		Pupil p=new Pupil(1,"Mihir","Mumbai","IT",3,47,50);
		p.getPupil();
		System.out.println("Average Marks : "+p.avgMarks());
	}
}