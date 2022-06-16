#include<iostream>
using namespace std;


class Person
{
public:
   int id;
   char name[20],city[20];

    void setPerson()
    {
        cout<<"Enter Id : ";
        cin>>id;
        cout<<"Enter Name : ";
        cin>>name;
        fflush(stdin);
        cout<<"Enter City : ";
        cin>>city;
    }

    void getPerson()
    {
        cout<<"ID : "<<id<<endl;
        cout<<"Name : "<<name<<endl;
        cout<<"City : "<<city<<endl;
    }
};

class Student : public Person
{
public:
    char branch[20];
    int sem,m1,m2;

    void setStudent()
    {
        setPerson();
        cout<<"Enter Branch : ";
        cin>>branch;
        fflush(stdin);
        cout<<"Enter Semester : ";
        cin>>sem;
        cout<<"Enter Marks of Subject 1 : ";
        cin>>m1;
        cout<<"Enter Marks of Subject 2 : ";
        cin>>m2;
    }

    void getStudent()
    {
        getPerson();
        cout<<"Branch : "<<branch<<endl;
        cout<<"Semester : "<<sem<<endl;
        cout<<"Marks of Subject 1 : "<<m1<<endl;
        cout<<"Marks of Subject 2 : "<<m2<<endl;
    }

    void avgMarks()
    {
        cout<<"Average Marks are : "<<(((float)m1+m2)/2);
    }
};

class VisitingTeacher : public Person
{
public:
    int exp,rph,nhrs;

    void setVisitingTeacher()
    {
        setPerson();
        cout<<"Enter Experience : ";
        cin>>exp;
        cout<<"Enter Rate Per Hour : ";
        cin>>rph;
        cout<<"Enter Number of Hours : ";
        cin>>nhrs;
    }


    void getVisitingTeacher()
    {
        getPerson();
        cout<<"Experience : "<<exp<<endl;
        cout<<"Rate per Hour : "<<rph<<endl;
        cout<<"Number of Hours : "<<nhrs<<endl;
    }

    void calSalary()
    {
        cout<<"Monthly Salary : "<<(rph*nhrs);
    }
};

int main()
{
    VisitingTeacher t;
    t.setVisitingTeacher();
    t.getVisitingTeacher();
    t.calSalary();

    Student s;
    s.setStudent();
    s.getStudent();
    s.avgMarks();


}
