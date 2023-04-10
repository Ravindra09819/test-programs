import java.util.*;
public class StringPattern 
{
    public static void main(String[] ar)
    {
       
Scanner so=new Scanner(System.in);
System.out.print("Enter the string: ");
String s=so.nextLine().toUpperCase();

        printStar(s);

        System.out.println();
        System.out.print("* ");
        for(int i=0; i<s.length();i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.print("*");
        System.out.println();
        
        printStar(s);

        
    }

    private static void printStar(String s){
        for(int i=0; i<s.length()+2;i++)
        {
            System.out.print("* ");
        }
    }
}
