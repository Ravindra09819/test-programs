import java.util.*;
public class PrintStar1 {

    public static void Display(int iNo1,int iNo2)
    {
        for(int i=0;i<iNo1;i++)
        {
            for(int j=i+1;j<=iNo2;j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int Row=sc.nextInt();
        System.out.print("Enter number of col: ");
        int Col=sc.nextInt();
        Display(Row, Col);
          
    }
    
}
