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
    int operator+(Distance a);

};
int Distance::operator+(Distance b)
{
    return km+b.km;
}
int main()
{
    Distance a,b;
    a.setDistance();
    a.getDistance();
    b.setDistance();
    b.getDistance();
    cout<<"Sum of Distances is : "<<(a+b)<<endl;
}
