import java.util.*;
import java.io.*;

class Anagram
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
    System.out.print("Enter a first string: ");
    String str=sc.nextLine().toLowerCase();
    System.out.print("Enter a second string: ");
    String str1=sc.nextLine().toLowerCase();
    char a[]=str.toCharArray();
    char b[]=str1.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);

    if(Arrays.equals(a, b))
    {
System.out.println("String is anagram ");
    }
    else
    {
        System.out.println("String is NOT anagram ");
    }
    
    }


}