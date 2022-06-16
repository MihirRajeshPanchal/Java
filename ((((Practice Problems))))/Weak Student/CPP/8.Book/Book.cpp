#include<iostream>
using namespace std;

class Book
{
public:
    int isbnn,qty,price;
    char title[20],author[20],publisher[20];

    void setBook()
    {
        cout<<"\nEnter ISBN : ";
        cin>>isbnn;
        cout<<"Enter Title : ";
        cin>>title;
        cout<<"Enter Author : ";
        cin>>author;
        cout<<"Enter Publisher : ";
        cin>>publisher;
        cout<<"Enter Quantity : ";
        cin>>qty;
        cout<<"Enter Price : ";
        cin>>price;
    }

    void getBook()
    {
        cout<<"\nISBN : "<<isbnn<<endl;
        cout<<"Title : "<<title<<endl;
        cout<<"Author : "<<author<<endl;
        cout<<"Publisher : "<<publisher<<endl;
        cout<<"Quantity : "<<qty<<endl;
        cout<<"Price : "<<price<<endl;
    }

    void updateQty()
    {
        cout<<"\nEnter New Quantity : ";
        cin>>qty;
    }

    void updatePrice()
    {
        cout<<"\nEnter New Price : ";
        cin>>price;
    }

    void calBook()
    {
        cout<<"\nTotal Amount of Books is : "<<(qty*price)<<endl;
    }
};

int main()
{
    int choice;
    Book b;
    cout<<"(1).Set Book"<<endl;
    cout<<"(2).Display Book"<<endl;
    cout<<"(3).Update Quantity"<<endl;
    cout<<"(4).Update Price"<<endl;
    cout<<"(5).Total Amount"<<endl;
    cout<<"(6).Exit"<<endl;
    do
    {
        cout<<"\nEnter Choice : ";
        cin>>choice;
    switch(choice)
    {
    case 1:
        b.setBook();
        break;

    case 2:
        b.getBook();
        break;
    case 3:
        b.updateQty();
        break;
    case 4:
        b.updatePrice();
        break;
    case 5:
        b.calBook();
        break;
    case 6:
        break;
    default:
        cout<<"Wrong Input";
        break;
    }
    }while(choice!=6);
}
