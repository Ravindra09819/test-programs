#include<stdio.h>
#include<string.h>
int main()
{
int i,j;
char arr[20]="";


gets(arr);

int len=strlen(arr);

for(i=1;i<=3;i++)
{
    for(j=1;j<=len+2;j++)
    {

     

       
         if(j==2)
        {
            printf("%s",arr);
        }
       else if(i=1||i==3||j==1||j==len)
        {
            printf(" * ");
        }
    }
    printf("\n");
}
return 0;
}