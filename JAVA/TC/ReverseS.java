import java.util.*;
public class ReverseS {
    public static void main(String[] args)
     {
         Scanner sobj=new Scanner(System.in);

        String given ;
        System.out.println("Enter string:");
        given=sobj.nextLine();

        String reverse = "";
       // String temp;
        //temp=given;
        for (int i = given.length() - 1; i >= 0; i--)//i=16-1;16>=0;i--
         {
            reverse = reverse + given.charAt(i);//reverse=reverse+;
        }
        
if(given.equals(reverse))
{
    System.out.println("Yes:"+reverse);
}
else
{
    System.out.println("No:"+reverse);
}
     }
}






