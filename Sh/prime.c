#include<stdio.h>
void Display(int n1,int n2)
{
    int flag=1;
        for(int i=n1;i<=n2;i++)
        
        {
            flag=1;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }

            }
            if(flag==1)
            {
                printf("%d\t",i);
            }


        }
    }

int main()
{
    int ivalue1=0,ivalue2=0;
    printf("Enter the star\n");
    scanf("%d",&ivalue1);
    printf("Enter the end\n");
    scanf("%d",&ivalue2);
    Display(ivalue1,ivalue2);
    return 0;
}