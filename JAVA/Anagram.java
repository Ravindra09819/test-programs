import java.util.*;
public class Anagram 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a first string :");
        String str1=sobj.nextLine();
        System.out.println("enter second string: ");
        String str2=sobj.nextLine();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char arr[]=str1.toCharArray();
        char brr[]=str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        if(Arrays.equals(arr, brr))
        {
            System.out.print("string are anagram ");
        }
        else
        {
            System.out.print("string are not anagram ");
        }

    }
    
}
