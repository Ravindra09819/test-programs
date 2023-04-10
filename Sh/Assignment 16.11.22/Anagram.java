import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a 1st string: ");
        String str1 =sc.nextLine();
        System.out.println("Enter a 2nd string: ");
        String str2 =sc.nextLine();

        char a[]=str1.toLowerCase().toCharArray();
        char b[]=str1.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean status = a.equals(b);
        if(true)
        {
            System.out.println("String is anagram");
        }
        else
        {
            System.out.println("String is not anagram");
        }

        
        
    }
    
}
