#include<stdio.h>
void Dispaly(int iNo1,int iNo2)
{
    int Temp=0;
    Temp=iNo1;
    iNo1=iNo2;
    iNo2=Temp;
    printf("After %d\n",iNo1);
    printf("After %d",iNo2);
}
int main()

{
    int ivalue1=0,ivalue2=0;
    printf("Enter 1 st number\n");
    scanf("%d",&ivalue1);
     printf("Enter 2 nt number\n");
    scanf("%d",&ivalue2);
    Dispaly(ivalue1,ivalue2);
    return 0;

}