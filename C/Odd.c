#include<stdio.h>


void Display(int no)
{
for(int i=1;i<=no;i++)
{
if(i%2!=0)
{
printf("%d\n",i);
}
}
}
int main()
{
int value=0;
printf("Enter number :");
scanf("%d",&value);
Display(value);
return 0;
}
