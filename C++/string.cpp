#include<iostream>
using namespace std;
int Count(char str[])
{
   

    int iCnt = 0;

    while(*str != '\0')
    {
        if(*str == 'l')
        {
            iCnt++;
        }
        str++;
    }
    return iCnt;
}


int main()
{

    char Arr[20];
    int iret=0;
    cout<<"Enter string:";
    cin.getline(Arr,20);
    iret=Count(Arr);
    cout<<"String containt l :"<<iret<<endl;
    return 0;
}