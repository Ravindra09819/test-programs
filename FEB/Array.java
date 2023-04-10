import java.util.*;
public class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter number of col: ");
        int col = sc.nextInt();
        int x[][]= new int [row][col];
        System.out.print("Enter "+row*col+" values: \n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter below values: \n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(" "+x[i][j]);
            }

            System.out.print("\n");
        }
    }
    
}
