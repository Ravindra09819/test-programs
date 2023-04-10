import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int count=0,sum=0,rem;
        int temp=n;
        while(n!=0)
        {
            
            count++;
            n=n/10;
        }
        n=temp;
        while(n!=0)
        {
            int mult=1;
             rem=n%10;
        for(int i=1;i<=count;i++)
        {
            mult=mult*rem;
        }
        sum=sum+mult;
        n=n/10;
    }
    if(temp==sum)
    {
        System.out.print("Number is Armstrong"+temp);
    }
    else
    {
        System.out.print("Number is not Armstrong"+temp);
    }


    }
    
}
