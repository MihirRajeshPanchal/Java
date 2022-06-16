package MyPack;
import java.util.Scanner;
class Student
{
	int id,sem;
	String name,city;

	Scanner sc=new Scanner(System.in);

	void setStudent()
	{
		System.out.print("Enter ID : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		name=sc.nextLine();
		System.out.print("Enter Semester : ");
		sem=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter City : ");
		city=sc.nextLine();	
	}

	void getStudent()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Semester : "+sem);
		System.out.println("City : "+city);
	}
}
class StudentMain
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setStudent();
		s.getStudent();
	}
}