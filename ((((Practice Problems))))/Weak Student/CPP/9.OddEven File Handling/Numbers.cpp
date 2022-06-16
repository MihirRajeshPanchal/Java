#include <iostream>
#include <fstream>
using namespace std;
int main()
{
char ch;
int num;
ifstream infile;
infile.open ("Numbers.txt",ios::in);
while(infile)
{
ch=infile.get();
num=ch-48;

if(num%2==0)
{
    cout<<num<<" is an even Number\n";
}
else
{
    cout<<num<<" is an odd Number\n";
}

}
infile.close();
}
