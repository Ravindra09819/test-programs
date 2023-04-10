#include<iostream>
using namespace std;

int Countcon(char brr[])
{
    int icnt=0,ivcnt=0;
    while (*brr!='\0')
    {
        if(*brr=='a'||*brr=='e'||*brr=='o'||*brr=='u'||*brr=='i'||*brr=='A'||*brr=='E'||*brr=='O'||*brr=='U'||*brr=='I')
        {
            icnt++;
    }
    else{
        ivcnt++;
        cout<<*brr<<endl;
    }
    brr++;
}
return ivcnt;
}

int main()
{
    char Arr[20];
    int iret=0;
    cout<<"Enter a string"<<endl;

    cin.getline(Arr,20);
iret=Countcon(Arr);
cout<<"number of consonant are "<<iret<<endl;
    return 0;
}