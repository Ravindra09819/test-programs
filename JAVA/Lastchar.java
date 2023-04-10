import java.util.*;
public class Lastchar {
    public static void main(String args[])
    {
        Scanner so=new Scanner(System.in);
        System.out.print("Enter a string:");
        String given=so.nextLine();
        
        for(int i=given.length()-1;i>=0;i--)
        {

            // System.out.println(given);
            System.out.println(given.charAt(i));
            
        }


    }
}
