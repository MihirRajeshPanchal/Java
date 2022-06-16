#include<iostream>
using namespace std;

class Distance
{
public:
    int km;

    void setDistance()
    {
        cout<<"Enter Distance in Kilometers : ";
        cin>>km;
    }

    void getDistance()
    {
        cout<<"Distance in Kilometers : "<<km<<endl;
    }
    int operator>(Distance a);

};
int Distance::operator>(Distance b)
{
    if(km>b.km)
    {
        return 1;
    }
    else if(km<b.km)
    {
        return -1;
    }
    else
    {
        return 0;
    }
}
int main()
{
    Distance a,b;
    a.setDistance();
    a.getDistance();
    b.setDistance();
    b.getDistance();
    int c=a>b;
    if(c==1)
    {
        cout<<"Object A's Distance is more than Object B's Distance";
    }
    else if(c==-1)
    {
        cout<<"Object A's Distance is less than Object B's Distance";
    }
    else
    {
        cout<<"Object A's Distance is equal to Object B's Distance";
    }
}
