import java.util.*;
public class Countc
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str =sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='\0')
            {
                count++;
            }
        }
        System.out.print(count);
    }
    
}
