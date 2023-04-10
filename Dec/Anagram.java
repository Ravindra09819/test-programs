import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string:\n");
        String str1 = sc.nextLine();
        System.out.print("Enter second string:\n");
        String str2 = sc.nextLine();
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.print("String is anagram");

        }
        else
        {
            System.out.print("String is not anagram");
        }
    }
    
}
