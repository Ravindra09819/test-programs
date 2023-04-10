import java.util.Scanner;

public class Validstring
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str1 = sc.nextLine();
        String rev="";
        String temp=".";
        
       for(int i=str1.length()-1;i>str1.length()-2;i--)
       {
        rev=rev+str1.charAt(i);
        

       }
       
       if(rev.equals("."))
       {
        System.out.println("string contains dot");
 }
 else
 {
   System.out.println("string not contains dot");

  }


       }
       
        


       

    }

