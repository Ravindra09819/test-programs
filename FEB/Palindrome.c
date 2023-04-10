#include<stdio.h>

void Display(int No)
{
    int rem=0,sum=0;
    int temp=0;
    temp=No;
    while(No!=0)
    {
        rem=No%10;
        sum=sum*10+rem;
        No=No/10;

    }
    No=temp;
    if(sum==No)
    {
        printf("Number is Palindrome :");
    }
    else
    {
        printf("Number is Not Palindrome :");
    }

}
int main()
{
    int ino=0;
    printf("Enter the number: ");
    scanf("%d",&ino);
    Display(ino);
    return 0;
}