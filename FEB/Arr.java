import java.util.*;
public class Arr
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        int row[]= new int[5];
         
        // int x[]= new int [row];
        for(int i=0;i<5;i++)
        {
            row[i]=sc.nextInt();
        }
        System.out.print("entered below values : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(" "+row[i]);
        }
    }
    
}
