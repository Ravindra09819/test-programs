import java.util.*;
public class Print2 {
    
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int Row=sc.nextInt();
        System.out.print("Enter the Col: ");
        int Col=sc.nextInt();
        for(int i=0;i<Row;i++)
        {
            for(int j=Col;j>=0;j--)
            {
                System.out.print(" * ");
       
            }
            System.out.print("\n ");
        }

       
    }
}
