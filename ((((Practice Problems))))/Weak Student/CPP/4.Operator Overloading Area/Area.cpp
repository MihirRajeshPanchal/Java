#include<iostream>
using namespace std;

class Circle
{
public:
    int r;
    void setCircle()
    {
        cout<<"Enter Radius of Circle : ";
        cin>>r;
    }
    void getCircle()
    {
        cout<<"Radius of Circle : "<<r<<endl;
    }

    float calArea()
    {
        return 3.14*r*r;
    }
};
class Triangle
{
public:
    int base,height;
    void setTriangle()
    {
        cout<<"Enter Base of Triangle : ";
        cin>>base;
        cout<<"Enter Height of Triangle : ";
        cin>>height;
    }
    void getTriangle()
    {
        cout<<"Base of Triangle : "<<base<<endl;
        cout<<"Height of Triangle : "<<height<<endl;
    }

    float calArea()
    {
        return 0.5*base*height;
    }
};
class Square
{
public:
    int side;
    void setSquare()
    {
        cout<<"Enter Side of Square : ";
        cin>>side;
    }
    void getSquare()
    {
        cout<<"Side of Square : "<<side<<endl;
    }

    float calArea()
    {
        return side*side;
    }
};

int main()
{
    Circle c;
    c.setCircle();
    c.getCircle();
    cout<<"Area of Circle : "<<c.calArea()<<endl;

    Triangle t;
    t.setTriangle();
    t.getTriangle();
    cout<<"Area of Triangle : "<<t.calArea()<<endl;

    Square s;
    s.setSquare();
    s.getSquare();
    cout<<"Area of Square : "<<s.calArea()<<endl;
}
