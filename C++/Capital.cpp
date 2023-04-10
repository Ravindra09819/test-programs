#include<iostream>
using namespace std;


void Capital(char str[])
{
while(*str!='\0')
{
    if((*str  >='a')&&(*str  <='z'))
    {
        *str=*str-32;
    }
    str++;
}

}
int main()
{

char Arr[20];
cout<<"Enter string:"<<endl;
cin.getline(Arr,20);

Capital(Arr);
cout<<"String is:"<<Arr<<endl;

}