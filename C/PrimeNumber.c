#include<stdio.h>
int main()
{
    int n=0;
    printf("Enter the number: ");
    scanf("%d",&n);

    for(int i=5;i<=n;i++)
    {
        for(int j=2;j<=i/2;j++)
        {
            if(i%j!=0)
            {
              printf("%d\n",i);
            }
        }
    }

}