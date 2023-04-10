                   /*
*  *  *  * 
*  *  * 
*  * 
*  
         */



import java.util.*;
public class Printstar {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int Row=sc.nextInt();
        int Col=sc.nextInt();
        for(int i=0;i<Row;i++)
        {
            for(int j=i+1;j<=Col;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
    
}
