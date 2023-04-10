#include<stdio.h>

void Display(int iNO)
{

    for(int i=1;i<=iNO;i++)
    {
        printf("   %d\n",i);
    }
}

int  main()
{
int iValue=0;
printf("Enter number:\n");
scanf("%d",&iValue);
Display(iValue);
return 0;


}