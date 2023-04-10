

/*
 
$  *  *  * 
 #  $  *  * 
 #  #  $  * 
 #  #  #  $ 

 */
import java.util.*;

public class Starprint1 {
    public static void main(String ar[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the row: ");
        int Row = sc.nextInt();
        System.out.print("Enter the col: ");
        int Col = sc.nextInt();
        for(int i=0;i<Row;i++)
        {
            for(int j=0;j<Col;j++)
            {
                if(i<j)
                {
                    System.out.print(" * ");
                }
                else if(i>j)
                {
                    System.out.print(" # ");
                }
                else
                {
                    System.out.print(" $ ");

                }

            }
            System.out.println();

        }

        
    



    }
    
}
