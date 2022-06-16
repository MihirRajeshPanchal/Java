#include<iostream>
#include <fstream>
using namespace std;

int main()
{
    int id,sem;
    char name[20];

    cout<<"Enter ID : ";
    cin>>id;
    cout<<"Enter Name : ";
    cin>>name;
    cout<<"Enter Semester : ";
    cin>>sem;

    ofstream outfile;
    outfile.open("Student.txt",ios::app);
    outfile<<"ID : "<<id<<"\nName : "<<name<<"\nSemester : "<<sem<<endl;
    outfile.close();
}
