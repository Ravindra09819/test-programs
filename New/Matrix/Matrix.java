import java.util.*;
class Matrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many row: ");
        int row = sc.nextInt();
        System.out.print("How many col: ");
        int col = sc.nextInt();
        int x[][]= new int  [row][col];
        System.out.print("please enter "+(row*col)+" values: \n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
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