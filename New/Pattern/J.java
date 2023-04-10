import java.util.*;
public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        for(int  i=1,ch='R';i<=n;i++,ch++)
        {

            for(int j=1,ch1='r';j<=i;j++,ch1++)
            {
                System.out.print(ch1+" ");
            }
            System.out.print("\n");

        }
    }
    
}
