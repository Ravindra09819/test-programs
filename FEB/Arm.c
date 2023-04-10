#include<stdio.h>
void Display(int No)
{
    int temp=0;
    int icnt=0,mult=0,sum=0;
    temp=No;
    while(No!=0)
    {
        icnt++;
        No=No/10;
    }
   No=temp;
   
    
    while (No!=0)
    {
        mult=1;
        int rev=No%10;
        for(int i=1;i<=icnt;i++)
        {
             mult=mult*rev;
        }
        sum=sum+mult;

       No=No/10;

    }
     
    if(sum==temp)
    {
        printf("Number is Armstrong");
    }
    else
    {
    printf("Number is NOT Armstrong");
    }
    
}

int main()
{
    int ino=0,iret=0;
    printf("Enter the number: ");
    scanf("%d",&ino);
   Display(ino);
   

    return 0;
}