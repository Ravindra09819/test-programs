#include<iostream>
using namespace std;
int Vowel(char str[])
{
    int icnt=0;
    while (*str!='\0')
    {
        if(*str=='a'||*str=='e'||*str=='o'||*str=='i'||*str=='u'||*str=='A'||*str=='E'||*str=='O'||*str=='I'||*str=='U')
        {
            icnt++;
        }
        str++;
    }
    return icnt;
}





int main()
{
    char Ar[20];
    int iret=0;
    cout<<"Enter a string: "<<endl;
    cin.getline(Ar,20);
    iret=Vowel(Ar);

cout<<"Number od vowrl are :"<<iret<<endl;

    return 0;
}