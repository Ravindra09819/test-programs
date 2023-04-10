#include<iostream>
using namespace std;
int Display(int ino)
{
    int icnt=0,ifact=1;
    for(icnt=1;icnt<=ino;icnt++)
    {
     ifact=ifact*icnt;
    }
    return ifact;
}

int main()
{
int no=0,iret=0;
cout<<"Enter number\n";
cin>>no;

iret=Display(no);
cout<<"Factorial is:"<<iret<<endl;
return 0;
}