#include<stdio.h>
void Display(int n)
{
    for(int i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            printf("%d\t",i);
        }
       
    }
}
int main()
{
    int ivalue=0;
    printf("Enter the number\n");
    scanf("%d",&ivalue);
    Display(ivalue);
return 0;
}