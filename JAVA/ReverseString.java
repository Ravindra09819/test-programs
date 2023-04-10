import java.util.*;

public class ReverseString {
    public static void main(String args[])
    {
        Scanner so=new Scanner(System.in);
        System.out.print("Enter a string :");
        String given=so.nextLine();
        String str=" ";
        int len=given.length();
        for(int i=given.length()-1;i>=0;i--)
        {
            str=str+given.charAt(i);
        }
        System.out.print("Reverse sring is :"+str);
        System.out.print("\n");





    }
}
