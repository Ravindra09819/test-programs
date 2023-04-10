import java.util.*;
public class Starprint {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Row=sc.nextInt();
        int Col=sc.nextInt();
        for(int i=Row;i>0;i--)
        {
            for(int j=1;j<0;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
    
}
