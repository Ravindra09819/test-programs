#include<stdio.h>

void Display(int iNo1,int iNo2)
{
   
    for(int i=1;i<=iNo1;i++)
    {
        for(int j=1;j<=iNo2;j++)
        {
            printf("%d\t",i*j);
        }
        printf("\n");
    }
}
int  main()
{
int iValue=0,iValue1=0;
printf("Enter number:");
scanf("%d",&iValue);

printf("Enter 2nd number:");
scanf("%d",&iValue1);
Display(iValue,iValue1);


    return 0;

}