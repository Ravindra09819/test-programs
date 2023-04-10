import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str =sc .nextLine().toUpperCase();
printstar(str);
System.out.print("\n");
        System.out.print("* ");
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.print("*");
        System.out.print("\n");
        printstar(str);
        
        }
        public static void printstar(String str)
        {
            for(int i=0;i<str.length()+2;i++)
        {
            System.out.print("* ");
        }
       
    }
    
}
