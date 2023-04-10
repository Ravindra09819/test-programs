import java.util.Scanner;

public class Reversepali {
    public static void main(String args[])
    {
        Scanner so=new Scanner(System.in);
        System.out.print("Enter a string:");
        String given=so.nextLine();
       
        String str="";
        for(int i=given.length()-1;i>=0;i--)
        {
            str=str+given.charAt(i);
        }
if(given.equals(str))
{
    System.out.print("String is  Palindrome: "+str);

}

else
{
    System.out.print("String is NOT  Palindrome: "+str);

}


    }
    
}
