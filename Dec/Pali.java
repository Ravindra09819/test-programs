import java.util.*;
public class Pali
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number\n");
        int n = sc.nextInt();
        int rem=0,sum=0;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("number is Palindrome: ");
        }
        else
        {
            System.out.print("number is not Palindrome: ");
        }

    }
    
}
