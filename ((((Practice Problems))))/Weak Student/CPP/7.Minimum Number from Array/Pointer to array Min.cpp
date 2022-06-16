#include<iostream>
using namespace std;

int main()
{
int a[10],n,i,*min;
cout<<"How Many Numbers you want to enter ? : ";
cin>>n;
cout<<"Enter "<<n<<" numbers now \n";
for(i=0;i<n;i++)
{
cout<<"Enter Number "<<i+1<<": ";
cin>>a[i];
}
min=a;
*min=*a;

    for(i=1;i<n;i++)
    {
        if(*(a+i)<*min)
        {
           *min=*(a+i);
        }
    }
    cout<<"Minimum element is : "<<*min;
    return 0;
}
