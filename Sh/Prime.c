#include<stdio.h>
void Display(int no)
{
    int flag=0;
    for(int i=2;i<=no/2;i++)
    {
        if(no%i==0)
        {
            flag=1;
            break;
        }
       
    }
    if(flag==0)
       {
        printf("%d is prime number");
       }
       else
       {
        printf("%d is not prime number");
       }
}
int main()
{
    int n;
    printf("Enter a number\n");
    scanf("%d",&n);
    Display(n);
    return 0;
}