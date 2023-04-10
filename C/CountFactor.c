#include<stdio.h>

int Display(int iNo)
{
int icnt=0;
for(int i=1;i<=iNo;i++)
{
    if((iNo%i)==0)
    {
        icnt++;
    }
}
return icnt;


}

int main()
{

    int ivalue=0,iret=0;
    printf("Enter number:");
    scanf("%d",&ivalue);

iret=Display(ivalue);
printf("number of factor are :%d",iret);
    return 0;

}