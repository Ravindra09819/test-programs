#include<iostream>
using namespace std;

int main()
{
    int no,no1;
    cout<<"Enter number"<<endl;
    cin>>no;
    cout<<"Enter number"<<endl;
    cin>>no1;
    for(int i=1;i<=no;i++)
    {
        for(int j=1;j<=no1;j++)
        {
            cout<<"*\t";
        }
        cout<<"\n";
    }
}