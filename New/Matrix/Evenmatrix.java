import java.util.*;
public class Evenmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row= sc.nextInt();
        System.out.print("Enter col: ");
        int col= sc.nextInt();
        int x[][]= new int [row][col];
        System.out.print("please enter "+(row*col)+" values:\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                x[i][j]=sc.nextInt();
                
            }
        }
        System.out.print("below values are even: \n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(x[i][j]%2==0)
                {
                    System.out.print(x[i][j]+" ");
                }
                
            }
        }

    }
    
}
