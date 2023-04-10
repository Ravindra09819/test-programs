#include<stdio.h>
int Display(int no)
{

while(no<0)
{
no=-no;
}
int idigit=0,sum=0;
while(no!=0)
{
idigit=no%10;
sum=sum+idigit;
no=no/10;
}
return sum;
}

int main()
{
int value=0;
printf("Enter number\n");
scanf("%d",&value);
int iret=0;
iret=Display(value);
printf(" summation is:%d",iret);
return 0;
}
