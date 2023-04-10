#include<stdio.h>
void Display(int iNo,int iNo1)
{
for(int i=0;i<iNo;i++)
{
    for(int j=0;j<iNo1;j++)
    {
        if(i<j)
        {
            printf("*\t");
        }
    }
    printf("\n");
}
    
}

int main()
{
int iRow=0,iCol=0,iret;
printf("Enter the Row\n");
scanf("%d",&iRow);
printf("Enter the Col\n");

scanf("%d",&iCol);
Display(iRow,iCol);
    return 0;

}
