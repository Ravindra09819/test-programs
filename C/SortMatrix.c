#include<stdio.h>
void sortmatrix(int arr[4][4])
{
    int i,j,k;
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            //current minimum elements
            int minimum=arr[i][j];
            //index of the current

            //minimum element
            int z=i;
            int q=i;

            //check if any smaller elements
            //is present in the matrix

            int w=j;
            for(k=1;k<4;k++)
            {
                for(w=1;w<4;w++)
                {
                    //update the minimum elements
                    if(minimum<arr[k][w])
                    {
                        //update the index of 
                        //the minimum elements
                        z=k;
                        q=w;
                    
                    }
                }
                w=0;
            }
            //swap the current element
            //and the minimum element
            int temp=arr[i][j];
            arr[i][j]=arr[z][q];
            arr[z][q]=temp;
        }
    }
}

void main()
{
    int arr[4][4];
    int i,j;
    printf("\n enter elements in array \n");
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            scanf("%d ",&arr[i][j]);
        }
       
    }

    sortmatrix(arr);
    for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            printf("%d \t",arr[i][j]);
        }
        printf("\n");
    }
}