#include<stdio.h>

void Display(int no)
{
for(int i=1;i<=no;i++)
{
for(int j=1;j<=no;j++)
{
printf("%d\t",j*10+i-10);
}
printf("\n");
}

}

int main()

{
int value=0;
printf("Enter number\n");
scanf("%d",&value);

Display(value);
return 0;

}
