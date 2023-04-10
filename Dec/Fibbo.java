import java.util.*;
public class Fibbo
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :\n");
        int n= sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            sum=sum+n3;
            n1=n2;
            n2=n3;
        }
        System.out.print("\n");
        System.out.print("Sum is:"+sum);

        
    }
    
}
