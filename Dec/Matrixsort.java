import java.util.Scanner;

public class Matrixsort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter number of row :");
        int row = sc.nextInt();
        System.out.print("Enter number of col :");
        int col = sc.nextInt();
        System.out.print("Enter"+(row*col)+"number :");
        int Arr[][] = new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter below number: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Sorted matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<row;k++)
                {
                    for(int l=0;l<col;l++)
                    {
                        if(Arr[i][j]<Arr[k][l])
                        {
                            int temp = Arr[i][j];
                            Arr[i][j]=Arr[k][l];
                            Arr[k][l]=temp;
                        }
                    }
                }
            }
        }
        System.out.print(" Sorted number: \n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.print("\n");
        }

        
    }

    
}
