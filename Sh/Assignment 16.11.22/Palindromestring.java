import java.util.*;
public class Palindromestring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  string: ");
        String str=sc.nextLine();
        String str2=str;
       String rev="";
      
        
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        
        if(str2.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not  palindrome");
        }

    }
    
}
