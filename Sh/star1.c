/*

* * * * *
* * * *
* * *
* *
*

*/
#include<stdio.h>
void Display(int Row,int Col)
{
    for(int i=Row;i>=0;i--)
    {
        for(int j=0;j<i;j++)
        {
            printf(" * ");
        }
        printf("\n");
    }
}
int main()
{
    int ivalue1,ivalue2;
    printf("Enter the row\n");
    scanf("%d",&ivalue1);
     printf("Enter the col\n");
    scanf("%d",&ivalue2);
    Display(ivalue1,ivalue2);

    return 0;
}