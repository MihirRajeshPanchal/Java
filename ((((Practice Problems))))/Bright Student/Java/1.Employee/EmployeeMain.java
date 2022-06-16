import java.util.Scanner;
class Employee
{
    Scanner sc=new Scanner(System.in);
    String fname,lname;
    int id;
    double sal;
    
    Employee(int id,String fname,String lname,double sal)
    {
        this.id=id;
        this.fname=fname;
        this.lname=lname;
        this.sal=sal;
    }

    void setEmployee()
    {
        System.out.print("Enter Id : ");
        id=sc.nextInt(); 
        System.out.print("Enter First Name : ");
        fname=sc.nextLine();   
        System.out.print("Enter Last Name : ");
        lname=sc.nextLine();  
        System.out.print("Enter Monthly Salary : ");
        sal=sc.nextDouble();
    }

    void getEmployee()
    {
        System.out.println("ID : "+id);
        System.out.println("First Name : "+fname);
        System.out.println("Last Name : "+lname);
        System.out.println("Monthly Salary : "+sal);
    }

    void setID()
    {
        System.out.print("Enter Id : ");
        id=sc.nextInt();
    }

    void setFname()
    {
        System.out.print("Enter First Name : ");
        fname=sc.nextLine();
    }

    void setLname()
    {
        System.out.print("Enter Last Name : ");
        lname=sc.nextLine();    
    }

    void setSal()
    {
        System.out.print("Enter Monthly Salary : ");
        sal=sc.nextDouble();
    }

    int getID()
    {
        return id;
    }

    String getFname()
    {
        return fname;
    }

    String getLname()
    {
        return fname;
    }

    double getSal()
    {
        return sal;
    }

    double calYearlySal()
    {
        return sal*12;
    }
}
class EmployeeMain
{
    public static void main(String[] args) 
    {
        Employee e1=new Employee(01,"Mihir","Panchal",30000);
        e1.getEmployee();
        System.out.println(e1.calYearlySal());
        System.out.println((e1.calYearlySal()*0.1)+e1.calYearlySal());
        
        Employee e2=new Employee(02,"Mihir","Panchal",10000);
        e2.getEmployee();
        System.out.println(e2.calYearlySal());
        System.out.println((e2.calYearlySal()*0.1)+e2.calYearlySal());
    }
}