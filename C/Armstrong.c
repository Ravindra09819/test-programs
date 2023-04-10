#include<stdio.h>

void Display(int no)
{
int itemp=0;
int mult=1,sum=0,iDigit=0,i=0,digit=0;


while(no<0)
{
no=-no;

}
itemp=no;
while(no>0)
{
digit++;
no=no/10;
}
no=itemp;
while(no!=0)
{
mult=1;
iDigit=no%10;
for(i=1;i<=digit;i++)
{
mult=mult*iDigit;
}
sum=sum+mult;
no=no/10;

}
if(sum == itemp)
   
{
printf("%d is Arm number",sum);
}
else
{
printf("%d is not Arm number",sum);
}
}
int main()
{
int value=0,iret=0;
printf("Enter number");
scanf("%d",&value);
Display(value);

return 0;
}
