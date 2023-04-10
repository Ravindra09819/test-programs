#include<stdio.h>
void Display(int iNo)
{
    int i=0;
    for(i=1;i<=iNo;i++)
    {
        int c=2,d=0;
        d=c*i;
        printf("%d\n",d);
    }
}

int main()
{
int iValue=0;
printf("Enter number\n:");
scanf("%d",&iValue);
Display(iValue);
return 0;


}