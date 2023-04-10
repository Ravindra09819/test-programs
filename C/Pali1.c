#include<stdio.h>

void Display(int no)
{
while(no<0)
{
no=-no;
}
int rev=0,digit=0,temp=0;
temp=no;
while(no>0)
{
digit=no%10;
rev=rev*10+digit;
no=no/10;
}
if(rev==temp)

{
printf("%d is palindrome number",temp);
}
else
{
printf("%d is not palindrome number",temp);
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
