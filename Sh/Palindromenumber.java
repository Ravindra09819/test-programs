import java.util.*;
public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int iDigit=0,Rev=0;
        int temp=n;
        while(n!=0)
        {
            iDigit=n%10;
            Rev=Rev*10+iDigit;
            n=n/10;
        }
        if(temp==Rev)
        {
            System.out.print("Number is palindrome "+temp);
        }
        else
        {
            System.out.print("Number is not palindrom " +temp);
        }

    }
    
}
