#include<stdio.h>
void Display(int no)
{
while(no<0)
{
no=-no;
}
int idigit=0;
while(no>0)
{
idigit=no%10;
printf("%d\n",idigit);
no=no/10;
}
}
int main()
{
int value=0;
printf("Enter number:");
scanf("%d",&value);
Display(value);


return 0;
}
