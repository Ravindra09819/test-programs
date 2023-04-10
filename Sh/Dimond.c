





#include<stdio.h>

void Display(int n)
{
    for(int i=1;i<n;i++)
    {
        for(int j=n;j>i;j--)
        {
            printf(" ");
        }
        for(int k=1;k<=(i*2-1);k++)
        {
            printf("*");
        }
        printf("\n");
    }
     for(int i=n-1;i>0;i--)
    {
        for(int j=n;j>i;j--)
        {
            printf(" ");
        }
        for(int k=1;k<=(i*2-1);k++)
        {
            printf("*");
        }
        printf("\n");
    }
}
int main()
{
    int ivalue1=0,ivalue2=0;
    printf("Enter the number\n");
    scanf("%d",&ivalue1);
    Display(ivalue1);

}




