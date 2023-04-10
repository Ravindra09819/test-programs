import java.util.*;
public class Prime
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,u ,flag,i,j;
        System.out.print("Enter lower number: ");
        l=sc.nextInt();
        System.out.print("Enter upper number: ");
        u=sc.nextInt();
        for(i=l;i<=u;i++)
        {
            flag=1;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(" "+ i);
            }
        }

    }
    
}
