import java.util.*;
class Matrix
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Row ");
             int row=sc.nextInt();
             System.out.print("Enter number of Col ");
             int col=sc.nextInt();
             
             System.out.print("Enter "+(row*col)+" number\n");
             int Arr[][]= new int[row][col];
             for(int i=0;i<row;i++)
             {
                for(int j=0;j<col;j++)
                {
                    Arr[i][j]=sc.nextInt();
                }

             }

             for(int i=0;i<row;i++)
             {
                for(int j=0;j<col;j++)
                {
                    System.out.print(Arr[i][j]+" ");
                }
                System.out.println();

             }


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
                                int temp=Arr[i][j];
                                Arr[i][j]=Arr[k][l];
                                Arr[k][l]=temp;
                               
                            }
                           
                        }
                       
                    }
                }

             }
System.out.println("Sorted Array");

             for(int i=0;i<row;i++)
             {
                for(int j=0;j<col;j++)
                {
                     System.out.print(Arr[i][j]+" ");
                }
                System.out.println();

             }

    }
}