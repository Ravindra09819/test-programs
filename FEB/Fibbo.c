#include<stdio.h>
void Display(int No)
{
    int no1=0;
    int no2=1;
    int no3=0;
    printf("%d ",no1);
    printf("%d ",no2);
    for(int i=1;i<=No;i++)
    {
        no3=no1+no2;
        printf("%d ",no3);
        no1=no2;
        no2=no3;

    }
    
}

int main()
{
    int ino=0;
    printf("Enter the Number: ");
    scanf("%d",&ino);
    Display(ino);

    return 0;

}