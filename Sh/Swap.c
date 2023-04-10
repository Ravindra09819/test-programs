#include<stdio.h>
void Display(int iNo1,int iNo2)
{
    iNo1=iNo1+iNo2;
    iNo2=iNo1-iNo2;
    iNo1=iNo1-iNo2;
    printf("first number: %d\n",iNo1);
    printf("first second: %d",iNo2);
}
int main()
{
    int ivalue1=0,ivalue2=0;
    printf("Enter first number\n");
    scanf("%d",&ivalue1);

     printf("Enter second number\n");
    scanf("%d",&ivalue2);
    Display(ivalue1,ivalue2);
    return 0;
}