#include<stdio.h>

int Display(int no,int no1)
{
int mult=1,icnt=0;
for(icnt=1;icnt<=no1;icnt++)
{
mult=mult*no;
}
return mult;
}
int main()
{
int base=0,power=0,iret=0;
printf("Enter base number\n");
scanf("%d",&base);
printf("Enter power number\n");
scanf("%d",&power);
iret=Display(base,power);
printf("Result is : %d",iret);
return 0;
}
