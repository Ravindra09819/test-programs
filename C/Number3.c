#include<stdio.h>
void Display(int iNo)
{
    int i=1;
    while(i<=iNo)
    {
        printf(" %d\n",i);
        i++;
    }
}

int main()
{
int iValue=0;
printf("Enter number\n");
scanf("%d",&iValue);

Display(iValue);
    return 0;

}