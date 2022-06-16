/*Consider a class named Student having id and name as instance members. A class Test inherits Student and having PT1 and PT2 as data members. 
There is one interface named Sports which contains a variable points assigned with value 5. 
(additional points of sports should be added in total marks of student who participated and won in sports activities in the semester)

Write a Java program to calculate the total marks of a student.*/
import java.util.Scanner;
interface Sports
{
    int ext=5;
    void extra();
}
abstract class Student
{
    int id;
    String name;
    Student(int a,String b)
    {
        id=a;
        name=b;
    } 
    void display()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
} 
class Test extends Student implements Sports
{
    int pt1,pt2;
    
    Test(int a,String b,int pt1,int pt2)
    {
        super(a,b);
        this.pt1=pt1;
        this.pt2=pt2;
    }

      public void extra()
      {
          Scanner sc =new Scanner(System.in);
          System.out.println("Press Y if you have represeted at state/national level sports");
          //String methods
          int total;
          char choice=sc.next().charAt(0);        //reads a string "Yes".charAt(0)
          if(choice=='Y')
          {
              total=pt1+pt2+ext;
              System.out.print("Total Marks : "+total);
          }
          else
          {
              total=pt1+pt2;
              System.out.print("Total Marks : "+total);
          }
      }
      
}

class StudentMain
{
    public static void main(String args[])
    {
        Test t=new Test(10,"Mihir",10,10);
        t.display();
        t.extra();
    }
}