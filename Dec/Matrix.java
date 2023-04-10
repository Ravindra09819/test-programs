import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row\n");
        int row = sc.nextInt();
        System.out.print("Enter number of col\n");
        int col = sc.nextInt();
        System.out.print("Enter "+(row*col)+"Number: ");
        int Arr[][] = new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("below number Entered :\n");

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
