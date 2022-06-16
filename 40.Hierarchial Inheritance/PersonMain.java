class Person
{
	String name;
	int age;

	Person(String n,int a)
	{
		name=n;
		age=a;
	}

	void getPerson()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
class Student extends Person
{
	int id,sem,m1,m2;
	String course;

	Student(String n,int a,int id,int sem,String c,int m1,int m2)
	{
	super(n,a);
	this.id=id;
	this.sem=sem;
	course=c;
	this.m1=m1;
	this.m2=m2;
	}

	void getStudent()
	{
		getPerson();
		System.out.println("ID : "+id);
		System.out.println("Semester : "+sem);
		System.out.println("Course : "+course);
		System.out.println("Marks 1 : "+m1);
		System.out.println("Marks 2 : "+m2);
	}

	int getStudentTotal()
	{
		return m1+m2;
	}

	float getStudentAverage()
	{
		return (m1+m2)/2f;
	}
}

class Faculty extends Person
{
	int id,exp,basic,level;
	String qualification;
	Faculty(String n,int a,int id,int exp,String q,int basic,int level)
	{
	super(n,a);
	this.id=id;
	this.exp=exp;
	qualification=q;
	this.basic=basic;
	this.level=level;
	}

	void getFaculty()
	{
		getPerson();
		System.out.println("ID : "+id);
		System.out.println("Experience : "+exp);
		System.out.println("Qualification : "+qualification);
	}

	float calSalary()
	{
		float hra=45*this.basic/100;
		float da=65*this.basic/100;
		int ea=0,ta=0;
		switch(this.level)
		{
			case 1:
				ea=3000;
				ta=6000;
				break;
			case 2:
				ea=2000;
				ta=5000;
				break;
			case 3:
				ea=1000;
				ta=3000;
				break;
			case 4:
				ea=500;
				ta=1500;
				break;
			default:
			    System.out.println("Invalid Employee Allowance Level");
			    System.exit(0);
				break;
		}
		return hra+da+ea+ta+basic;
	}
}

class PersonMain
{
	public static void main(String args[])
	{
		System.out.println("\nStudent Details : ");
		Student s1=new Student("Mihir",17,18,3,"IT",100,91);
		s1.getStudent();
		System.out.println("Total : "+s1.getStudentTotal());
		System.out.println("Average : "+s1.getStudentAverage());
		System.out.println("\nFaculty Details : ");
		Faculty f1=new Faculty("John",40,001,15,"Btech",10000,1);
		f1.getFaculty();
		System.out.println("Gross Salary : "+f1.calSalary());
	}
}