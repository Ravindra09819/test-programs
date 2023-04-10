#include<stdio.h>
int Display(int No)
{
    int imult=1;
    for(int i=1;i<=No;i++)
    {
      imult=imult*i;
    }
    return imult;
}


int main()
{
    int ino=0,iret=0;
    printf("Enter the number :");
    scanf("%d",&ino);
    iret=Display(ino);
    printf("%d factorial is :%d",ino,iret);
return 0;
}