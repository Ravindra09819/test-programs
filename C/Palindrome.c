#include<stdio.h>

int Display(int no)
{
while(no<0)
{a
no=-no;
}
int rev=0,digit=0;
while(no>0)
{
digit=no%10;
rev=rev*10+digit;
no=no/10;
}
return rev;
}

int main()
{
int value=0,iret=0;
printf("Enter number");
scanf("%d",&value);
iret=Display(value);
if(iret==value)
{
printf("%d is palindrome number",value);
}
else
{
printf("%d is not palindrome number",value);
}

return 0;
}
