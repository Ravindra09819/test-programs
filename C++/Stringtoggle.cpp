#include<iostream>
using namespace std;

void lower(char str[])
{
    while(*str!='\0')
    {
        if((*str>='A')&&(*str<='Z'))
        {
            *str=*str+32;

        }
        else if ((*str>='a')&&(*str<='z'))
        {
            *str=*str-32;

        }
        
        str++;
    }
}
int main()
{
char Arr[20];
cout<<"Enter string :";
cin.getline(Arr,20);
lower(Arr);
 cout<<"String in lower case : "<<Arr<<endl;

return 0;
}