import java.util.*;
class NumRev
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0,sum=0;
        while(n>0)
        {
           int  rem=n%10;
             sum=sum*10+rem;
            n=n/10;
            

        }
        System.out.print("Reverse number is: "+sum);

    }
}