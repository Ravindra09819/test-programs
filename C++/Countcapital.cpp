#include<iostream>
using namespace std;

int Countcapital(char str[])
{
    int icnt=0;
    while(*str !='\0')
    {
        if((*str=='a')||(*str=='e')||(*str=='e')||(*str=='o')||(*str=='u'))
        {
            icnt++;
        }
        str++;
    }
    return icnt;
}

int main()
{
char Arr[20];
int iret=0;
cout<<"Enter string :";
cin.getline(Arr,20);

iret=Countcapital(Arr);
cout<<"Number of vowels are:"<<iret<<endl;

    return 0;
}