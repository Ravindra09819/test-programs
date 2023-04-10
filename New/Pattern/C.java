import java.util.Scanner;
/*
 1 
 1 1 
 1 1 1
 1 1 1 1
 */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number\n");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(" 1 "+" ");
            }
            System.out.print("\n");
        }
    }
    
}
