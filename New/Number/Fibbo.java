import java.util.*;
public class Fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        int sum=0;
        for(int  i=1;i<=n;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            sum=sum+n3;
            n1=n2;
            n2=n3;
  
        }
        System.out.print("\n Sum is: "+sum);
    }
    
}
