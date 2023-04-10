import java.util.*;
class StringR
{
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
      String str;
      String revstr="";
      System.out.println("Enter a string");
      str=sobj.nextLine();
      int length=str.length();
      for(int i=length-1;i>=0;i--)
      {
          revstr=revstr+str.charAt(i);
      } 
      System.out.print("Reverse string is:"+revstr);
    
    }
}