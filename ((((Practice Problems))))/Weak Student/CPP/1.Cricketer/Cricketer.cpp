#include<iostream>
using namespace std;

class Cricketer
{
public:
    char name[20],country[20];
    int runs,innings,nno;

    void setCricketer()
    {
        cout<<"Enter Name of Cricketer : ";
        cin>>name;
        fflush(stdin);
        cout<<"Enter Country of Cricketer : ";
        cin>>country;
        fflush(stdin);
        cout<<"Enter Runs of Cricketer : ";
        cin>>runs;
        cout<<"Enter Innings : ";
        cin>>innings;
        cout<<"Enter Number of Not Outs : ";
        cin>>nno;
    }

    void getCricketer()
    {
        cout<<"Name : "<<name<<endl;
        cout<<"Country : "<<country<<endl;
        cout<<"Runs : "<<runs<<endl;
        cout<<"Innings : "<<innings<<endl;
        cout<<"Number of Not Outs : "<<nno<<endl;
    }

    float calBatAvg()
    {
        return (float)runs/(innings-nno);
    }

};

int main()
{
    Cricketer c;
    c.setCricketer();
    c.getCricketer();
    cout<<"Batting Average is : "<<c.calBatAvg();
}
