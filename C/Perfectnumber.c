#include<stdio.h>

int Display(int ino)
{
int i=0,sum=0;
for(i=1;i<=ino/2;i++)
{
if(ino%i==0)
{
sum=sum+i;
}

}
if(sum==ino)
{
return 2;
}
else
{
return 3;
}
}



int main()
{


int ivalue=0;
printf("Enter number\n");
scanf("%d",&ivalue);
int  iret=0;
iret=Display(ivalue);
if(iret==2)
{
printf("%d is perfect number",ivalue);
}
else
{
printf("%d is not perfect number",ivalue);
}

return 0;
}
