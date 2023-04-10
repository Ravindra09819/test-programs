import java.util.*;
/*
 1 2 3 4 
 1 2 3 
 1 2 
 1 
 1 
 1 2 
 1 2 3
 1 2 3 4
 */
public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
            

            
        } 
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");

        }

    }
    
}
