import java.util.Scanner;
/*
 1 2 3 4  
 1 2 3 4  
 1 2 3 4  
 1 2 3 4  
*/
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number print:\n");
        int n=sc.nextInt();
        for(int  i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    
}
