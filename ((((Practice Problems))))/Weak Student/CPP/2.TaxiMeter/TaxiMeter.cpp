#include<iostream>
using namespace std;

class TaxiMeter
{
public:
    int taxino,km;
    char name[20];

    void input()
    {
        cout<<"\nEnter Taxi No : ";
        cin>>taxino;
        cout<<"Enter Name of Passenger : ";
        cin>>name;
        fflush(stdin);
        cout<<"Enter Kilometers Traveled : ";
        cin>>km;
    }
    void display()
    {
        cout<<"Taxi No : "<<taxino<<endl;
        cout<<"Passenger Name : "<<name<<endl;
        cout<<"Kilometer Traveled : "<<km<<endl;
    }

    int calculate()
	{
		if(km<=10)
		{
			return km*25;
		}
		else if((km>10)&&(km<=60))
		{
			return 25+((km-10)*22);
		}
		else if((km>60)&&(km<=120))
		{
			return 25+(10*22)+((km-60)*18);
		}
		else if((km>120)&&(km<=200))
		{
			return 25+(10*22)+(60*18)+(km-120)*15;
		}
		else if(km>200)
		{
			return 25+(10*10)+(6*15)+(6*20)+(km-200)*10;
		}
		return 0;
	}
};

int main()
{
    int i;
    cout<<"Enter Number of Rides : ";
    cin>>i;
    TaxiMeter t[i];
    for(int j=0;j<i;j++)
    {
        t[i].input();
        t[i].display();
        cout<<"Fare : "<<t[i].calculate();
    }

}
