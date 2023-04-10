#include<stdio.h>

int Display(int iNo)
{
int number,rem=0,mult=1,sum=0,sum1=0,n;
while(iNo!=1)
{

number=iNo/10;
rem=n%10;
sum=number*number+rem*rem;
number=sum;

}
return sum;
}

int main()
{
/*int n=0;
printf("Enter number\n");
scanf("%d",&n);*/
int iret=0;
iret=Display(19);
//printf("%d",iret);
return 0;
}
