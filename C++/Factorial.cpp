#include<iostream>
using namespace std;

class Number
{
    public:
    int Display(int ino)
    {
           int icnt=0,ifact=1;
           for(int icnt=1;icnt<=ino;icnt++)
           {
               ifact=ifact*icnt;
           }
           return  ifact;
    }
};
int main()
{
int no,iret=0;
cout<<"Enter number\n";
cin>>no;
Number nobj;
iret=nobj.Display(no);
cout<<"Factorial is:"<<iret<<endl;


    return 0;

}