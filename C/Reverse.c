#include<stdio.h>

int Display(int no)
{

while(no<0)
{
no=-no;
}

int sum=0,digit=0;
while(no>0)
{
digit=no%10;
sum=sum*10+digit;
no=no/10;
}

return sum;
}

int main()
{
int value=0,iret=0;
printf("Enter number");
scanf("%d",&value);
iret=Display(value);
printf("Reverse %d",iret);
return 0;
}

