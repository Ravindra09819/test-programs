import java.util.*;
/*
 1R 
 1R 2R
 1R 2R 3R
 1R 2R 3R 4R
 */
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"R"+" ");
            }
            System.out.print("\n");
        }

    }
    
}
