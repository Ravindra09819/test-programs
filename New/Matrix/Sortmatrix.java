import java.util.Scanner;

public class Sortmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter row: ");
       int row=sc.nextInt();
       System.out.print("Enter col: ");
       int col = sc.nextInt();
       int x[][]=new int [row][col];

       System.out.print("please enter "+(row*col)+"  values: \n");
       for(int i=0;i<row;i++)
       {
        for( int j=0;j<col;j++)
        {
            x[i][j]=sc.nextInt();
        }

       }
       for(int i=0;i<row;i++)
       {
        for( int j=0;j<col;j++)
        {
            System.out.print(x[i][j]+" ");
        }
        System.out.print("\n");

       }
       for(int i=0;i<row;i++)
       {
        for( int j=0;j<col;j++)
        {
          for(int k=0;k<row;k++)
          {
            for(int l=0;l<col;l++)
            {
                if(x[i][j]<x[k][l])
                {
                 int temp=x[i][j];
                x[i][j]=x[k][l];
                x[k][l]=temp;
                }
            }
          }
        }

       }
       System.out.print("Sorted matrix: \n");
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
            System.out.print(x[i][j]+" ");
        }
        System.out.print("\n");
      }
    }
    
}
