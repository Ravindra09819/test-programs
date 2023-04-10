#include<stdio.h>
void Display(int No)
{
    for(int i=1;i<No;i++)
    {
        for(int j=No;j>i;j--)
        {
            printf(" ");
        }
        for(int k=1;k<=i*2-1;k++)
        {
            printf("*");
        }
        printf("\n");
    }
}


int main()
{
    int ino=0;
    printf("Enter the number: ");
    scanf("%d",&ino);
Display(ino);
    return 0;
}