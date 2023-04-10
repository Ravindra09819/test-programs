#include<stdio.h>
int Display(int no)
{
int i=0,count=0;
for(i=2;i<=no;i++)
{
if(no%i==0)//5%1=0;5%2=1
{
count++;
printf("%d \n",count);
}
}
 if(count==1)
   {
   printf("%d is prime number",no);
   }
   else
   {
   printf("%d is not prime number",no);
   }
   }

int main()
{
   
   int value=0,iret=0;
   printf("Enter number\n");
   scanf("%d",&value);
   Display(value);
   
return 0;

}
