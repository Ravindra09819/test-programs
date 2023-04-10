#include<iostream>
using namespace std;

int Countcapitall(char str[])
{
    int icnt=0;
    while (*str!='\0')
    {
        if((*str>='A')&&(*str<='Z'))-
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
    cout<<"Enter a string"<<endl;
    cin.getline(Arr,20);
    iret=Countcapitall(Arr);
    cout<<"Number of character  are : "<<iret<<endl;
    return 0;
}
